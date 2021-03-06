package palette_database;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class PaletteDatabase {
	
	private ArrayList<Palette> palettes;
	
	public PaletteDatabase() {
		palettes = new ArrayList<Palette>();
	}
	
	public void addPalette(Palette p) {
		palettes.add(p);
	}
	
	public ArrayList<Palette> getDatabase() {
		return palettes;
	}
	
	public void addFromFile(String inputFile) {
		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = ",";
		
		try {
			br = new BufferedReader(new FileReader(inputFile));
			while ((line = br.readLine()) != null) {

				String[] data = line.split(cvsSplitBy);
				Palette p = new Palette(data[0], new Color(data[1]),
												 new Color(data[2]),
												 new Color(data[3]),
												 new Color(data[4]),
												 new Color(data[5]));
				
				int nb_descriptors = (data.length - 6) / 2;
				for(int i = 0; i < nb_descriptors; i++)
				{
					Descriptor des = new Descriptor(data[6 + 2*i], data[7 + 2*i]);
					if (des.concept != null)
						p.addDescriptor(des);
					//else System.out.println("null descriptor: " + des.word);
				}
				
				this.addPalette(p);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public void print() {
		for(Palette p : palettes) {
			System.out.println(p);
			//for(Descriptor des : p.descriptors) {
				//System.out.println("|   " + des.toString());
				//System.out.println(des.concept);
			//}
		}
	}

}
