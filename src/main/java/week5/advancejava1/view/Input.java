package week5.advancejava1.view;

import java.util.Scanner;

import week5.advancejava1.SearchIp.TshirtSearchIp;
import week5.advancejava1.data.*;

public class Input {
 
	public String getColor(Scanner scn) {
		boolean isValid = true;
		System.out.println("Enter color of Tshirt:\n(available: Black,White,Blue,Purple,Grey,Pink,Maroon,Yellow)");
		
		String colorType="";
		do {
			try {
				colorType = scn.nextLine();
			//	System.out.println(Color.valueOf(colorType.toUpperCase()));
				if(Color.valueOf(colorType.toUpperCase())!=null)
					isValid = false;
				
			}
			catch(IllegalArgumentException e) {
				System.out.println("Enter a valid color of Tshirt:\n(available: Black,White,Blue,Purple,Grey,Pink,Maroon,Yellow)");
			}
		}
		while(isValid);
		return colorType;
	}
	
	public String getSize(Scanner scn) {
		boolean isValid = true;
		System.out.println("Enter size of Tshirt: \n(choose: S , M , L, XL )");
		
		String sizeType="";
		do {
			try {
				sizeType = scn.nextLine();
				if(Size.valueOf(sizeType.toUpperCase())!=null)
					isValid = false;
				
			}
			catch(IllegalArgumentException e) {
				System.out.println("Enter a valid size of Tshirt:\n(choose: S , M , L, XL )");}
		
			} while(isValid);
		return sizeType;
	}
		
		public String getGender(Scanner scn) {
			boolean isValid = true;
			System.out.println("Gender : \n(M-male,F-female,U-unisex)");
			
			String gender="";
			do {
				try {
					gender = scn.nextLine();
					if(Gender.valueOf(gender.toUpperCase())!=null)
						isValid = false;
					
				}
				catch(IllegalArgumentException e) {
					System.out.println("Enter a valid Gender:\n(M-male , F-femle,U-unisex )");
			}
			} while(isValid);
			return gender;
		}
			
			public String getOutputPreference(Scanner scn) {
				boolean isValid = true;
				System.out.println("Enter sorting output preference of Tshirt : \n(Price,Rating,Both)");
				
				String outputPreference="";
				do {
					try {
						outputPreference = scn.nextLine();
						if(OutputPreference.valueOf(outputPreference.toUpperCase())!=null)
							isValid = false;
						
					}
					catch(IllegalArgumentException e) {
						System.out.println("Enter a valid output preference:");
				}
			} while(isValid);
				return outputPreference;
	}
			
		public TshirtSearchIp getInput() {
			
			TshirtSearchIp tshirtSearchIp = new TshirtSearchIp();
			Scanner scn = new Scanner(System.in);
			
			System.out.println("Enter the Required Details:\n");
					
			String color = getColor(scn);
		    String size = getSize(scn);
		    String gender = getGender(scn);
		    String outputPreference = getOutputPreference(scn);
		    
		    tshirtSearchIp.setColor(Color.valueOf(color.toUpperCase()));
		    tshirtSearchIp.setSize(Size.valueOf(size.toUpperCase()));
		    tshirtSearchIp.setGender(Gender.valueOf(gender.toUpperCase()));
		    tshirtSearchIp.setOutputPreference(OutputPreference.valueOf(outputPreference.toUpperCase()));
		    
		    return tshirtSearchIp;
		}

}
