package iodata;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
/*
 * 操作基本数据类型的流
 * DataInputStream
 * DataOutputStream
 */
public class DataStreamDemo {
	public static void main(String[] args) throws IOException {
		write();
		read();
		}

		private static void read() throws FileNotFoundException, IOException {
		DataInputStream dis = new DataInputStream(
		new FileInputStream("dos.txt"));
		byte b = dis.readByte();
		System.out.println(b);
		short s = dis.readShort();
		System.out.println(s);
		int i = dis.readInt();
		System.out.println(i);
		long l = dis.readLong();
		System.out.println(l);
		float f = dis.readFloat();
		System.out.println(f);
		double d = dis.readDouble();
		System.out.println(d);
		char ch = dis.readChar();
		System.out.println(ch);
		boolean bb = dis.readBoolean();
		System.out.println(bb);
		dis.close();
		}

		private static void write() throws IOException {
		DataOutputStream dos = new DataOutputStream(new FileOutputStream(
		"dos.txt"));
		dos.writeByte(1);
		dos.writeShort(20);
		dos.writeInt(300);
		dos.writeLong(4000);
		dos.writeFloat(12.34f);
		dos.writeDouble(12.56);
		dos.writeChar('a');
		dos.writeBoolean(true);
		dos.close();
		}

}
