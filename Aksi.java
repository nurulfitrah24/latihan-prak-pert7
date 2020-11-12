//package pertemuan6

import java.util.Scanner;

/**
 *
 * @author E
 */
 public class Aksi{
 	public static void main(String args[]) {
 		String NIK,Nama,JenisKelamin;
 		int Umur;
 		String NIM,Fakultas,Jurusan;
 		double Tugas1,Tugas2,Tugas3;
 		double UTS, UAS;
 		double hasil;
 		
 		Mahasiswa MHS = new Mahasiswa();
 		Scanner SC = new Scanner(System.in);
 		
 		System.out.println("Mahasiswa NIK :");
 		NIK = SC.nextLine();
 		System.out.print("Masukkan Nama Anda :");
 		Nama = SC.nextLine();
 		System.out.print("Masukkan Jenis Kelamin :");
 		JenisKelamin = SC.nextLine();
 		System.out.print("Masukkan Umur :");
 		Umur = SC.nextInt();
 		SC.nextLine();
 		System.out.println("Masukkan NIM :");
 		NIM = SC.nextLine();
 		System.out.println("Masukkan Fakultas :");
 		Fakultas = SC.nextLine();
 		System.out.println("Masukkan Jurusan :");
 		Jurusan = SC.nextLine();
 		
 		System.out.println("Masukkan TGS1");
 		Tugas1 = SC.nextDouble();
 		System.out.println("Masukkan TGS2");
 		Tugas2 = SC.nextDouble();
 		System.out.println("Masukkan TGS3");
 		Tugas3 = SC.nextDouble();
 		System.out.println("Masukkan UTS");
 		UTS = SC.nextDouble();
 		System.out.println("Masukkan UAS");
 		UAS = SC.nextDouble();
 		
 		MHS.identitas(NIK, Nama, JenisKelamin, Umur);
 		MHS.dataMahasiswa(NIM, Fakultas, Jurusan);
 		MHS.nilaiMahasiswa(Tugas1, Tugas2, Tugas3, UTS, UAS);
 		
 		
 	}
 }