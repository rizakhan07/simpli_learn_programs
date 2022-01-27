import java.awt.*;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
	
public class project_1 {
	

	    public static void createFile() {
	        try {
	            System.out.print("Enter file name : ");
	            Scanner fi = new Scanner(System.in);
	            String fileName = fi.nextLine();
	            File file = new File(fileName);
	            boolean flag = file.createNewFile();
	            if (flag) {
	                System.out.println("File created");
	            } else {
	                System.out.println("File already exists");
	            }
	        } catch (IOException e) {
	            System.out.println("Exception Occurred:");
	            e.printStackTrace();
	        }
	    }

	    public static void updateFile() {
	        try {
	            Scanner ka = new Scanner(System.in);
	            System.out.print("Enter the file name: ");
	            String name = ka.nextLine();
	            FileOutputStream fos = new FileOutputStream(name, true);
	            System.out.print("Enter file content: ");
	            String str = ka.nextLine() + "\n";
	            byte[] b = str.getBytes();
	            fos.write(b);
	            fos.close();
	            System.out.println("The file has been saved.");
	        } catch (Exception e) {
	            System.out.println("Exception Occurred:");
	            e.printStackTrace();
	        }
	    }

	    public static void deleteFile() {
	        try {
	            Scanner dl = new Scanner(System.in);
	            System.out.print("Enter the file name to delete: ");
	            String name = dl.nextLine();
	            System.out.println("Path "+name);
	            File f = new File(name);
	            if (f.delete())
	            {
	                System.out.println("File " + f.getName() + " is deleted");

	            }
	            else {
	                System.out.println("Delete operation failed");
	            }
	        }
	        catch(Exception e) {
	            e.printStackTrace();
	        }
	    }

	    public static void openFile() {
	        try {
	            Scanner op = new Scanner(System.in);
	            System.out.print("Enter the file name to open : ");
	            String name = op.nextLine();
	            File file = new File(name);
	            if (!Desktop.isDesktopSupported())
	            {
	                System.out.println("not supported");
	                return;
	            }
	            Desktop desktop = Desktop.getDesktop();
	            if (file.exists())
	                desktop.open(file);
	        }
	        catch(Exception e) {
	            //e.printStackTrace();
	        }
	    }

	    public static void searchFile(){
	        Scanner sf = new Scanner(System.in);
	        System.out.print("Enter the file name you want to open : ");
	        String name = sf.nextLine();
	        File directory = new File("C:\\Users\\Muhammad Riza\\eclipse-workspace\\phase 1 project");
	        String[] flist = directory.list();
	        int flag = 0;
	        if (flist == null) {
	            System.out.println("Empty directory.");
	        }
	        else {
	            for (int i = 0; i < flist.length; i++) {
	                String filename = flist[i];
	                if (filename.equalsIgnoreCase(name)) {
	                    System.out.println(filename + " found");
	                    flag = 1;
	                }
	            }
	        }
	        if (flag == 0) {
	            System.out.println("File Not Found");
	        }
	    }
	    public static void main(String[] args) {
			
	        System.out.println("**************************************** Welcome to LockedMe.com ****************************************");
	        System.out.println("**************************************** This application is Developed by Riza ****************************************");
	        System.out.println("choose anyone for the below options");
	        boolean exit = false;
	        while (!exit){
	            Scanner sc = new Scanner(System.in);
	            System.out.println("1.Create File \n2.Update File \n3.Delete File \n4.Open File \n5.Search \n6.Exit");
	            System.out.print("Enter your choice number : ");
	            int choice = sc.nextInt();
	            switch (choice) {
	                case 1:
	                    createFile();
	                    break;

	                case 2:
	                    updateFile();
	                    break;

	                case 3:
	                    deleteFile();
	                    break;

	                case 4:
	                    openFile();
	                    break;

	                case 5:
	                    searchFile();
	                    break;

	                case 6:
	                    exit = true;
	                    break;

	                default:
	                    System.out.println("Enter Valid Option");
	            }
	        }

	    }
	}


