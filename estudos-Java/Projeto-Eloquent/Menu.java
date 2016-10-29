package console;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.TargetDataLine;

import de.voidplus.soundcloud.SoundCloud;
import de.voidplus.soundcloud.Track;


public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int nOpc = 0;

		while (nOpc != 4) {
			System.out.println ("\f");
			System.out.println("Escolha opção");
			System.out.println("1 - Gravar");
			System.out.println("2 - Reproduzir");
			System.out.println("3 - Postar");
			System.out.println("4 - Sair");
			nOpc = sc.nextInt();

			switch (nOpc) {
				case 1 :
					Gravar();
					break;
				case 2 :
					Reproduzir();
					break;
				case 3 :
					Postar();
					break;
				default:
					break;
			}
		}
	}

	public static void Gravar() {
		Scanner sc = new Scanner(System.in);
		int nOpc;
		String strFileName;
		File	outputFile;
		
		System.out.println("Entre com o nome do arquivo: ");
		strFileName = sc.next();
		outputFile = new File(strFileName);
		
		AudioFormat	audioFormat = new AudioFormat(
				AudioFormat.Encoding.PCM_SIGNED,
				44100.0F, 16, 2, 4, 44100.0F, false);
		
		DataLine.Info	info = new DataLine.Info(TargetDataLine.class, audioFormat);
		
		TargetDataLine	targetDataLine = null;
		try
		{
			targetDataLine = (TargetDataLine) AudioSystem.getLine(info);
			targetDataLine.open(audioFormat);
		}
		catch (LineUnavailableException e)
		{
			System.out.println("unable to get a recording line");
			e.printStackTrace();
			System.exit(1);
		}
		AudioFileFormat.Type	targetType = AudioFileFormat.Type.WAVE;
		
		testeRec	recorder = new testeRec(
				targetDataLine,
				targetType,
				outputFile);
		
		System.out.println("Press ENTER to start the recording.");
		
		try
		{
			System.in.read();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}

		recorder.start();
		
		System.out.println("Recording...");

		System.out.println("Press ENTER to stop the recording.");
		try
		{
			System.in.read();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}

		System.out.println("Press ENTER to stop the recording.");
		nOpc = sc.nextInt();
		
		recorder.stopRecording();
		System.out.println("Recording stopped.");
	}

	public static void Reproduzir() {
		Scanner sc = new Scanner(System.in);
		int nOpc;
		String audioFilePath;
		File	outputFile;
		
		System.out.println("Entre com o nome do arquivo: ");
		audioFilePath = sc.next();
		
        testeExec player = new testeExec();
        player.play(audioFilePath);
	}
	
	public static void Postar() {
		Scanner sc = new Scanner(System.in);
		String audioFilePath, login, senha, titulo;

		System.out.println("Entre com o login do SoundCloud: ");
		login = sc.next();
		
		System.out.println("Entre com a senha do SoundCloud: ");
		senha = sc.next();
		
		System.out.println("Entre com o nome do arquivo: ");
		audioFilePath = sc.next();

		System.out.println("Entre com o título da faixa: ");
		titulo = sc.next();
		
        SoundCloud soundcloud = new SoundCloud(
                "fb8abf0683e5f4af70bfdfcc37a4300b",
                "856ad2677ce1de91b6f8844eb614b3d9"
        );
        soundcloud.login(login,senha);
        Track track = soundcloud.postTrack(new Track(titulo, audioFilePath));
        System.out.println("Post efetuado com sucesso!");
	}
}