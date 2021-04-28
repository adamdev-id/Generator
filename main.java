import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Random;
import java.util.Scanner;

import com.github.javafaker.Faker;


public class main
{
	public static String Gender(int type)
	{
		String[] gender = { "L", "P" };
		int random = randBetween(0, 1);
		
		String output = "";
		
		switch (type)
		{
		case 1:
			output = gender[0];
			break;
		case 2:
			output = gender[1];
			break;
		case 3:
			output = gender[random];
			break;
		}
		
		return output;
	}
	
	public static String treatmentType()
	{
		int PERLU = 0;
		int TIDAK_PERLU = 1;
		
		String[][] type = {
			{ "Perlu Rujukan", "Tidak Perlu Rujukan" },
			{ "Perlu Ambulan", "Tidak Perlu Ambulan" },
			{ "Perlu Intensif", "Tidak Perlu Intensif" }
		};
		
		int types = randBetween(0, 2);
		int treatment = randBetween(PERLU, TIDAK_PERLU);
		
		String output = "";
		
		output = type[types][treatment];
		
		return output;
	}
	
	public static String Gejala()
	{
		String gejalaPasien = "";
		String gejalaResult = "";
		
		int DEMAM_BERDARAH = 0;
		int TIFUS = 1;
		int JANTUNG = 2;
		int PARU_PARU = 3;
		int PILEK = 4;
		int LIVER = 5;
		int GIGI = 6;
		int TELINGA = 7;
		
		String[] gejalaTypes = {
			"Demam Berdarah",
			"Tifus",
			"Jantung",
			"Paru Paru",
			"Pilek",
			"Liver",
			"Sakit Gigi",
			"Sakit Telinga"
		};
		
		String[][] gejalaDugaan = {
			{ "Kurang Vitamin", "Terkena Nyamuk" },
			{ "Makanan Kotor", "Terlalu Capai" },
			{ "Sakit Jantung", "Lemah Jantung" },
			{ "Pnumonia", "Asthma" },
			{ "Flu", "Terkena Bulu" },
			{ "Diabet", "Keracunan" },
			{ "Gigi Bengkak", "Infeksi" },
			{ "Kemasukan Binatang", "Alergi" }
		};
		
		int DUGAAN_1 = 0;
		int DUGAAN_2 = 1;
		
		int types = randBetween(DEMAM_BERDARAH, TELINGA);
		int dugaan = randBetween(DUGAAN_1, DUGAAN_2);
		
		gejalaPasien = gejalaTypes[types];
		
		switch (gejalaPasien)
		{
		case "Demam Berdarah":
			gejalaResult = gejalaDugaan[DEMAM_BERDARAH][dugaan];
			break;
		case "Tifus":
			gejalaResult = gejalaDugaan[TIFUS][dugaan];
			break;
		case "Jantung":
			gejalaResult = gejalaDugaan[JANTUNG][dugaan];
			break;
		case "Paru Paru":
			gejalaResult = gejalaDugaan[TIFUS][dugaan];
			break;
		case "Pilek":
			gejalaResult = gejalaDugaan[PILEK][dugaan];
			break;
		case "Liver":
			gejalaResult = gejalaDugaan[TIFUS][dugaan];
			break;
		case "Sakit Gigi":
			gejalaResult = gejalaDugaan[GIGI][dugaan];
			break;
		case "Sakit Telinga":
			gejalaResult = gejalaDugaan[TELINGA][dugaan];
			break;
		}
		
		return gejalaResult;
	}
	
	public static String Day()
	{
		int day = randBetween(1, 31);
		
		String output = "";
		
		if (day < 10)
		{
			output = "0" + day;
		}
		else if (day >= 10)
		{
			output = "" + day;
		}
		
		return output;
	}
	
	int day = randBetween(1, 31);
	
	public static void main(String[] args) throws IOException
	{
		
		SimpleDateFormat sd = new SimpleDateFormat("YYYY/dd/MM");
		GregorianCalendar gc = new GregorianCalendar();
		//		for (int i = 0; i < 20; i++)
		//		{
		//		}
		//System.out.println(gc.get(gc.YEAR) + "-" + (gc.get(gc.MONTH) + 1) + "-" + gc.get(gc.DAY_OF_MONTH));
		Random r = new Random();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("How many Lines to Generate: ");
		System.out.print("> ");
		int amount = Integer.parseInt(scanner.nextLine());
		
		System.out.println("");
		
		System.out.println("1. Randbetween [tgl_lahir pasien]");
		System.out.println("2. Randbetween [tgl_lahir pasien]");
		System.out.println("3. Randbetween [Treatment]");
		System.out.println("4. Randbetween [Gejala]");
		System.out.println("5. Randbetween [Date]");
		System.out.println("6. Randbetween [Year]");
		System.out.println("7. Randbetween [Date]");
		System.out.println("8. Randbetween [Month]");
		System.out.println("9. Randbetween [ArrayID]");
		System.out.println("10. Query Generator");
		System.out.print("> ");
		int mode = Integer.parseInt(scanner.nextLine());
		
		switch (mode)
		{
		case 1:
			for (int i = 0; i < amount; i++)
			{
				int month = randBetween(1, 12);
				int year = randBetween(2020, 2021);
				
				gc.set(gc.YEAR, year);
				
				if (month < 10)
				{
					System.out.println(Day() + "/" + "0" + month + "/" + gc.get(gc.YEAR));
				}
				else
				{
					System.out.println(Day() + "/" + month + "/" + gc.get(gc.YEAR));
				}
			}
			break;
		case 2:
			String[] poliID = {
				"1030",
				"2020",
				"1020",
				"2030",
				"1040",
				"3050",
				"2010"
			};
			
			//System.out.println(arrayID[0]);
			//String output = arrayID[random];
			
			for (int i = 0; i < amount; i++)
			{
				int rand = randBetween(0, 6);
				
				if (i < 10)
				{
					System.out.println(poliID[rand] + "000000" + i);
				}
				else if (i > 10 && i < 100)
				{
					System.out.println(poliID[rand] + "00000" + i);
				}
				else if (i > 99)
				{
					System.out.println(poliID[rand] + "0000" + i);
				}
				else if (i > 99 && i < 1000)
				{
					System.out.println(poliID[rand] + "000" + i);
				}
			}
			break;
		case 3:
			for (int i = 0; i < amount; i++)
			{
				System.out.println(treatmentType());
			}
			break;
		case 4:
			for (int i = 0; i < amount; i++)
			{
				System.out.println(Gejala());
			}
			break;
		case 8:
			for (int i = 0; i < amount; i++)
			{
				int month = randBetween(1, 12);
				
				if (month < 10)
				{
					System.out.println("0" + month);
				}
				else
				{
					System.out.println(month);
				}
			}
			
			break;
		case 9:
			String[] arrayID = {
				"1030",
				"2020",
				"1020",
				"2030",
				"1040",
				"3050",
				"2010"
			};
			
			//System.out.println(arrayID[0]);
			//String output = arrayID[random];
			for (int i = 0; i < amount; i++)
			{
				int rand = randBetween(0, 6);
				System.out.println(arrayID[rand]);
			}
			break;
		case 10:
			
			//		System.out.println("Specify Table Name: ");
			//		System.out.print("> ");
			//		String tableName = scanner.nextLine();
			
			System.out.println("");
			
			System.out.println("Spicify Gender Type -");
			System.out.println("1. Male");
			System.out.println("2. Female");
			System.out.println("3. Random");
			System.out.println("Enter the number of the Gender (1, 2 or 3)");
			System.out.print("> ");
			int genderType = Integer.parseInt(scanner.nextLine());
			
			System.out.println("Print ID?: ");
			System.out.print("> ");
			int one = Integer.parseInt(scanner.nextLine());
			
			System.out.println("");
			
			System.out.println("Print Nama?: ");
			System.out.print("> ");
			int two = Integer.parseInt(scanner.nextLine());
			
			System.out.println("");
			
			System.out.println("Print Gender?: ");
			System.out.print("> ");
			int three = Integer.parseInt(scanner.nextLine());
			
			System.out.println("");
			
			System.out.println("Print Notelp?: ");
			System.out.print("> ");
			int four = Integer.parseInt(scanner.nextLine());
			
			System.out.println("");
			
			System.out.println("Print ID Poli?: ");
			System.out.print("> ");
			int five = Integer.parseInt(scanner.nextLine());
			
			System.out.println("");
			
			for (int i = 0; i <= amount; i++)
			{
				//System.out.print("INSERT INTO " + tableName);
				
				String merk;
				String mobil;
				String[] carBrands = { "Honda", "Toyota", "Suzuki", "Mazda", "Renault" };
				String[] carTypes = { "Supra", "Alphard", "Baleno", "RX-8", "Cleo" };
				
				merk = carBrands[r.nextInt(carBrands.length)];
				//mobil = carTypes[rand.nextInt(carBrands.length)];
				
				//			if (carBrands[r.nextInt(carBrands.length)].equals("Honda"))
				//			{
				//				System.out.println("Mobil : " + carBrands[0] + ", " + carTypes[0]);
				//			}
				//			else if (carBrands[r.nextInt(carBrands.length)].equals("Toyota"))
				//			{
				//				System.out.println("Mobil : " + carBrands[1] + ", " + carTypes[1]);
				//			}
				//			else if (carBrands[r.nextInt(carBrands.length)].equals("Suzuki"))
				//			{
				//				System.out.println("Mobil : " + carBrands[2] + ", " + carTypes[2]);
				//			}
				//			else if (carBrands[r.nextInt(carBrands.length)].equals("Mazda"))
				//			{
				//				System.out.println("Mobil : " + carBrands[3] + ", " + carTypes[3]);
				//			}
				//			else if (carBrands[r.nextInt(carBrands.length)].equals("Renault"))
				//			{
				//				System.out.println("Mobil : " + carBrands[4] + ", " + carTypes[4]);
				//			}
				
				String fileName = "D://Development//Eclipse-Workspace//DatabaseGenerator//names.txt";
				String fileKota = "D://Development//Eclipse-Workspace//DatabaseGenerator//kota.txt";
				ArrayList<String> allNames = new ArrayList<String>();
				ArrayList<String> allKota = new ArrayList<String>();
				Random random = new Random();
				//Random b = new Random();
				
				BufferedReader in = new BufferedReader(new FileReader(fileName));
				while (in.ready())
				{
					allNames.add(in.readLine());
				}
				
				BufferedReader kn = new BufferedReader(new FileReader(fileKota));
				while (kn.ready())
				{
					allKota.add(kn.readLine());
				}
				
				in.close();
				kn.close();
				
				String randomName = allNames.get(random.nextInt(allNames.size()));
				String randomKota = allKota.get(random.nextInt(allKota.size()));
				
				Faker faker = new Faker();
				
				String name = faker.name().fullName(); // Miss Samanta Schmidt
				String firstName = faker.name().firstName(); // Emory
				String lastName = faker.name().lastName(); // Barton
				
				String streetAddress = faker.address().streetAddress(); // 60018 Sawayn Brooks Suite 449
				
				//System.out.println("Fullname : " + name);;
				int tahun = randBetween(2020, 2021);
				
				gc.set(gc.YEAR, tahun);
				
				int dayOfYear = randBetween(1, gc.getActualMaximum(gc.DAY_OF_YEAR));
				
				gc.set(gc.DAY_OF_YEAR, dayOfYear);
				
				//     OUTPUT PROCESS STARTS HERE
				
				if (gc.get(gc.MONTH) < 9 && gc.get(gc.DAY_OF_MONTH) < 10)
				{
					if (one == 1)
					{
						System.out.print("1111" + i);
					}
					
					if (two == 1)
					{
						System.out.println(randomName);
					}
					
					if (three == 1)
					{
						System.out.println(Gender(genderType));
					}
					
					if (four == 1)
					{
						System.out.println("082" + r.nextInt(9) + r.nextInt(9) + r.nextInt(9) + r.nextInt(9) + r.nextInt(9) + r.nextInt(9) + r.nextInt(9) + r.nextInt(9) + r.nextInt(9));
					}
					
					if (five == 1)
					{
						System.out.println(r.nextInt(9) + r.nextInt(9) + r.nextInt(9) + r.nextInt(9) + r.nextInt(9) + r.nextInt(9) + r.nextInt(9) + r.nextInt(9) + r.nextInt(9) + r.nextInt(9));
					}
					
					//				System.out.print(", '" + randomName + "', '" + Gender(genderType) + "', ");
					//				System.out.print("'082" + r.nextInt(9) + r.nextInt(9) + r.nextInt(9) + r.nextInt(9) + r.nextInt(9) + r.nextInt(9) + r.nextInt(9) + r.nextInt(9) + r.nextInt(9) + "'");
					//				System.out.print(", '" + r.nextInt(9) + r.nextInt(9) + r.nextInt(9) + r.nextInt(9) + r.nextInt(9) + r.nextInt(9) + r.nextInt(9) + r.nextInt(9) + r.nextInt(9) + r.nextInt(9) + "'");
					//				int year = randBetween(2015, 2020);
					//				gc.set(gc.YEAR, year);
					//				System.out.print(")");
					//				System.out.println("");
				}
				else if (gc.get(gc.MONTH) == 10 && gc.get(gc.DAY_OF_MONTH) < 10)
				{
					if (one == 1)
					{
						System.out.println("1111" + i);
					}
					
					if (two == 1)
					{
						System.out.println(randomName);
					}
					
					if (three == 1)
					{
						System.out.println(Gender(genderType));
					}
					
					if (four == 1)
					{
						System.out.println("082" + r.nextInt(9) + r.nextInt(9) + r.nextInt(9) + r.nextInt(9) + r.nextInt(9) + r.nextInt(9) + r.nextInt(9) + r.nextInt(9) + r.nextInt(9));
					}
					
					if (five == 1)
					{
						System.out.println(r.nextInt(9) + r.nextInt(9) + r.nextInt(9) + r.nextInt(9) + r.nextInt(9) + r.nextInt(9) + r.nextInt(9) + r.nextInt(9) + r.nextInt(9) + r.nextInt(9));
					}
					
					//				int year = randBetween(2015, 2020);
					//				gc.set(gc.YEAR, year);
					//				System.out.print(")");
					//				System.out.println("");
				}
				else if (gc.get(gc.MONTH) > 9 && gc.get(gc.DAY_OF_MONTH) < 10)
				{
					if (one == 1)
					{
						System.out.print("1111" + i);
					}
					
					if (two == 1)
					{
						System.out.println(randomName);
					}
					
					if (three == 1)
					{
						System.out.println(Gender(genderType));
					}
					
					if (four == 1)
					{
						System.out.println("082" + r.nextInt(9) + r.nextInt(9) + r.nextInt(9) + r.nextInt(9) + r.nextInt(9) + r.nextInt(9) + r.nextInt(9) + r.nextInt(9) + r.nextInt(9));
					}
					
					if (five == 1)
					{
						System.out.println(r.nextInt(9) + r.nextInt(9) + r.nextInt(9) + r.nextInt(9) + r.nextInt(9) + r.nextInt(9) + r.nextInt(9) + r.nextInt(9) + r.nextInt(9) + r.nextInt(9));
					}
					
					//				int year = randBetween(2015, 2020);
					//				gc.set(gc.YEAR, year);
					//				System.out.print(")");
					//				System.out.println("");
				}
				else if (gc.get(gc.MONTH) < 9 && gc.get(gc.DAY_OF_MONTH) > 9)
				{
					if (one == 1)
					{
						System.out.print("1111" + i);
					}
					
					if (two == 1)
					{
						System.out.println(randomName);
					}
					
					if (three == 1)
					{
						System.out.println(Gender(genderType));
					}
					
					if (four == 1)
					{
						System.out.println("082" + r.nextInt(9) + r.nextInt(9) + r.nextInt(9) + r.nextInt(9) + r.nextInt(9) + r.nextInt(9) + r.nextInt(9) + r.nextInt(9) + r.nextInt(9));
					}
					
					if (five == 1)
					{
						System.out.println(r.nextInt(9) + r.nextInt(9) + r.nextInt(9) + r.nextInt(9) + r.nextInt(9) + r.nextInt(9) + r.nextInt(9) + r.nextInt(9) + r.nextInt(9) + r.nextInt(9));
					}
					
					//				int year = randBetween(2015, 2020);
					//				gc.set(gc.YEAR, year);
					//				System.out.print(")");
					//				System.out.println("");
				}
				else if (gc.get(gc.MONTH) > 9 && gc.get(gc.DAY_OF_MONTH) > 9)
				{
					if (one == 1)
					{
						System.out.print("1111" + i);
					}
					
					if (two == 1)
					{
						System.out.println(randomName);
					}
					
					if (three == 1)
					{
						System.out.println(Gender(genderType));
					}
					
					if (four == 1)
					{
						System.out.println("082" + r.nextInt(9) + r.nextInt(9) + r.nextInt(9) + r.nextInt(9) + r.nextInt(9) + r.nextInt(9) + r.nextInt(9) + r.nextInt(9) + r.nextInt(9));
					}
					
					if (five == 1)
					{
						System.out.println(r.nextInt(9) + r.nextInt(9) + r.nextInt(9) + r.nextInt(9) + r.nextInt(9) + r.nextInt(9) + r.nextInt(9) + r.nextInt(9) + r.nextInt(9) + r.nextInt(9));
					}
					
					//				int year = randBetween(2015, 2020);
					//				gc.set(gc.YEAR, year);
					//				System.out.print(")");
					//				System.out.println("");
				}
			}
			break;
		}
	}
	
	public static int randBetween(int start, int end)
	{
		return start + (int) Math.round(Math.random() * (end - start));
	}
	
	//	public static void main(String[] args)
	//	{
	//		
	//	}
}
