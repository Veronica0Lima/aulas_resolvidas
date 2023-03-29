package br.edu.insper.desagil.aula10;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FileManagerTest {
	private FileManager f;

	@BeforeEach
	private void setUp() {
		f = new FileManager();
	}

	@Test
	public void load() {
		String content = assertDoesNotThrow(() -> {
			return f.load("entrada.txt");
		});
		assertEquals("hello world\n", content);
	}

	@Test
	public void loadMissing() {
		IllegalArgumentException  e = assertThrows(IllegalArgumentException .class, () -> {
			f.load("missing.txt");
		});
		assertEquals("Arquivo não encontrado", e.getMessage());
	}

	@Test
	public void loadInvalid() {
		String content = assertDoesNotThrow(() -> {
			return f.load("invalid.txt");
		});
		assertNull(content);
	}

	@Test
	public void save() {
		assertDoesNotThrow(() -> {
		    f.save("hello world\n", "saida.txt");
		});
	}
}
