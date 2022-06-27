package week5.advancejava1.Csv;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


//import week5.advancejava1.CSVFile.*;
import week5.advancejava1.data.*;
import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

public class TshirtCsv {
	public static ArrayList<Tshirt>getAllTshirts(){
		
		ArrayList<Tshirt>getalldata=new ArrayList<Tshirt>();
		CSVReaderMethod("D:\\workspace\\somya\\advancejava1\\src\\main\\java\\week5\\advancejava1\\CSVFile\\Adidas.csv",getalldata);
		CSVReaderMethod("D:\\workspace\\somya\\advancejava1\\src\\main\\java\\week5\\advancejava1\\CSVFile\\Nike.csv",getalldata);
		CSVReaderMethod("D:\\workspace\\somya\\advancejava1\\src\\main\\java\\week5\\advancejava1\\CSVFile\\Puma.csv",getalldata);
		return getalldata;
		
	}
	
	private static void CSVReaderMethod(String filePath,ArrayList<Tshirt>getalldata) {
		try {
			CSVParser parser = new CSVParserBuilder().withSeparator('|').withIgnoreQuotations(true).build();
			CSVReader csvReader = new CSVReaderBuilder(new FileReader(filePath)).withCSVParser(parser).withSkipLines(1).build();
			
			String[] S;
			try {
				while((S=csvReader.readNext())!=null) {
					Tshirt tshirt = new Tshirt();
					
					tshirt.setId(S[0]);
					tshirt.setName(S[1]);
					tshirt.setColor(Color.valueOf(S[2].toUpperCase()));
					tshirt.setGender(Gender.valueOf(S[3].toUpperCase()));
					tshirt.setSize(Size.valueOf(S[4].toUpperCase()));
					tshirt.setPrice(Double.parseDouble(S[5]));
					tshirt.setRating(Double.parseDouble(S[6]));
					tshirt.setAvalibilty(S[7]);
					
					getalldata.add(tshirt);
					
				}
				
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
