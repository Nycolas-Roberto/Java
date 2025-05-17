package criptografia;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;

public class Criptografia {

	public static void main(String[] args) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
		// TODO Auto-generated method stub
		String texto = "Mensagem Original!";
		
		// Geração de chave!
		KeyGenerator keyGen = KeyGenerator.getInstance("AES");
		keyGen.init(128);
		SecretKey chave = keyGen.generateKey();
		
		// Criptografia
		Cipher cifra = Cipher.getInstance("AES");
		cifra.init(Cipher.ENCRYPT_MODE, chave);
		byte[] textoCriptografado = cifra.doFinal(texto.getBytes());
		
		// Codificação em Base64 para visualização como String
		String textoCripto_Base64 = Base64.getEncoder().encodeToString(textoCriptografado);
		System.out.println("Texto Criptografado em Base64 -> " + textoCripto_Base64);
		
		// Descriptografia
		cifra.init(Cipher.DECRYPT_MODE, chave);
		byte[] textoDescriptografado = cifra.doFinal(Base64.getDecoder().decode(textoCripto_Base64));
		System.out.println("Texto Descriptografado -> " + new String(textoDescriptografado));
	}

}
