package collections.maps.mapLabs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class MapLab1 {

	public static void main(String[] args) {
		File file = new File("C:\\turkcellGelecegiYazanlar\\Java301\\bin\\collections\\maps\\mapLabs\\dictionary.txt");
		FileReader fileReader = null;
		BufferedReader bufferedReader = null;
		try {
			fileReader = new FileReader(file);
			bufferedReader = new BufferedReader(fileReader);
			String line = null;
			SortedMap<String, String> sortedMap = new TreeMap<>();
			while ((line = bufferedReader.readLine()) != null) {
				String[] strings = line.split(":");
				// System.out.print(strings[0] + " = ");
				// System.out.println(strings[1]);
				sortedMap.put(strings[0], strings[1]);
			}

			System.out.println("Size: " + sortedMap.size());

			getKeysAndValues(sortedMap); // Sıralı getirdi

			System.out.println("************************");

			inputWord(sortedMap, file);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (bufferedReader != null) {
					bufferedReader.close();
				}
				if (fileReader != null) {
					fileReader.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

	public static void getKeysAndValues(SortedMap<String, String> sortedMap) {
		Set<Entry<String, String>> entiries = sortedMap.entrySet();
		Iterator<Entry<String, String>> iterator = entiries.iterator();
		while (iterator.hasNext()) {
			Entry<String, String> next = iterator.next();
			System.out.println(next);
		}
	}

	public static void inputWord(SortedMap<String, String> sortedMap, File file) {
		Scanner scanner = new Scanner(System.in);
		String input = null;
		System.out.print("Word: ");
		while (!(input = scanner.nextLine()).equals("exit")) {
			String value = sortedMap.get(input);
			if (value != null) {
				System.out.println(value);
			} else {
				System.out.println("Word could not find!Could you add this word? (Y)(N)");
				if (scanner.nextLine().equals("Y")) {
					System.out.print("New word: ");
					String newWord = scanner.nextLine();
					writerNewWord(file, input, newWord);
					sortedMap.put(input, newWord);
				}
			}
			System.out.print("Word: ");
		}
		scanner.close();
	}

	public static void writerNewWord(File file, String input, String newWord) {
		FileWriter fileWriter = null;
		try {
			fileWriter = new FileWriter(file, true);
			fileWriter.write("\n");
			fileWriter.write(input);
			fileWriter.write(":");
			fileWriter.write(newWord);
			fileWriter.flush();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (fileWriter != null) {
					fileWriter.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}

		}

	}
}
