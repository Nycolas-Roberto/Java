package descriptografia;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public class Descriptografia {

	public static void main(String[] args) throws IOException, NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
        // Ler chave que está salva
        FileInputStream key_in = new FileInputStream("..\\chaveAES.key");
        byte[] keyBytes = key_in.readAllBytes();
        key_in.close();
        SecretKey readKey = new SecretKeySpec(keyBytes, "AES");

        File raiz = new File("C:\\CodeWalker");
        File[] arquivos = raiz.listFiles();

        if (arquivos != null) {
            for (File arquivo : arquivos) {
                if (arquivo.isDirectory()) continue;

                if (arquivo.getName().endsWith(".corno")) {
                    // Leitura dos dados
                    FileInputStream fis = new FileInputStream(arquivo);
                    byte[] dadosCriptografados = fis.readAllBytes();
                    fis.close();

                    try {
                        // Descriptografia
                        Cipher cifra = Cipher.getInstance("AES");
                        cifra.init(Cipher.DECRYPT_MODE, readKey);

                        byte[] dadosDescriptografados = cifra.doFinal(dadosCriptografados);

                        // Remove extensão .corno
                        String nomeOriginal = arquivo.getName().substring(0, arquivo.getName().length() - ".corno".length());

                        // Salvar no mesmo diretório
                        File saida = new File(arquivo.getParent(), nomeOriginal);
                        FileOutputStream fos = new FileOutputStream(saida);
                        fos.write(dadosDescriptografados);
                        fos.close();

                        System.out.println("Descriptografado: " + saida.getAbsolutePath());
                        
                        arquivo.delete(); // Deletar os arquivos criptografados anteriormente
                    } catch (Exception e) {
                        System.out.println("Erro ao descriptografar o arquivo: " + arquivo.getName());
                        e.printStackTrace();
                    }
                }
            }
        } else {
            System.out.println("Erro ao ler raiz");
        }
	}

}
