package Cryptanalyzer;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;

public class FileWriteReade {
    private String fileRead;
    private String fileWrite;

    public FileWriteReade(String fileRead, String fileWrite){
        this.fileRead=fileRead;
        this.fileWrite=fileWrite;
    }

    public FileWriteReade() {
    }

    public byte[] readFile(){
        try(RandomAccessFile randomAccessFile=new RandomAccessFile(fileRead, "rw");
            FileChannel channel=randomAccessFile.getChannel();
            ByteArrayOutputStream byteArrayOutputStream=new ByteArrayOutputStream()) {
            ByteBuffer bytebuffer=ByteBuffer.allocate(2048);
            int endOfFile=-1;
            int intbufer=channel.read(bytebuffer);
            while (endOfFile!=intbufer){
                bytebuffer.flip();
                while (bytebuffer.hasRemaining()) {
                    byteArrayOutputStream.write(bytebuffer.get());
                }
                channel.write(bytebuffer);
                bytebuffer.clear();
                intbufer = channel.read(bytebuffer);
            }
            byte[] data = byteArrayOutputStream.toByteArray();
            return data;
            } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void writeFile(byte[] data){
        try(RandomAccessFile randomAccessFile=new RandomAccessFile(fileWrite, "rw");
            FileChannel channel=randomAccessFile.getChannel()){
            ByteBuffer bytebuffer=ByteBuffer.allocate(2048);
            int index = 0;
            while (index < data.length) {
                bytebuffer.clear();

                while (bytebuffer.hasRemaining() && index < data.length) {
                    bytebuffer.put(data[index++]);
                }

                bytebuffer.flip();
                channel.write(bytebuffer);
                bytebuffer.clear();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public char[] bytesToChars() {
        byte[] bytes = readFile();
        char[] chars = new String(bytes, StandardCharsets.UTF_8).toCharArray();
        return chars;
    }

    public byte[] charsToBytes(char[] chars) {
        String str = new String(chars);
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        return bytes;
    }
}
