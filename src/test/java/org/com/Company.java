package org.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Company {
	
	public static void main(String[] args) {
		
		
		
		String downloaddir="C:\\Users\\lakshman\\Desktop\\ram\\program\\cucumber";
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-popup-blocking");
		options.addArguments("download defaultdir"+downloaddir);
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.browserstack.com/test-on-the-right-mobile-devices");
		

        // Set the path to the ChromeDriver executable (replace with your own path)
//        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
//
//        // Set the download directory
//        String downloadDirectory = "/path/to/download/directory";
//
//        // Configure Chrome options for file download
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("download.default_directory=" + downloadDirectory);
//        options.addArguments("download.prompt_for_download=false");
//        options.addArguments("download.directory_upgrade=true");
//        options.addArguments("safebrowsing.enabled=true");
//
//        // Create a Chrome WebDriver instance with configured options
//        WebDriver driver = new ChromeDriver(options);
//
//        // Open a web page with a link to the file you want to download
//        driver.get("https://example.com/download");
//
//        // Find the link to the file and click on it
//        WebElement downloadLink = driver.findElement(By.linkText("Download File")); // Replace with the actual link text
//        downloadLink.click();
//
//        // Wait for the file to download (you may need to add a delay or use more advanced techniques)
//        // For simplicity, a static sleep is used here, but you may need to implement a more robust wait strategy
//        try {
//            Thread.sleep(10000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        // Close the browser window
//        driver.quit();

        // Set the path to the ChromeDriver executable (replace with your own path)
//        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
//
//        // Set the download directory
//        String downloadDirectory = "/path/to/download/directory";
//        String preferredLocation = "/path/to/preferred/location";
//
//        // Configure Chrome options for file download
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("download.default_directory=" + downloadDirectory);
//        options.addArguments("download.prompt_for_download=false");
//        options.addArguments("download.directory_upgrade=true");
//        options.addArguments("safebrowsing.enabled=true");
//
//        // Create a Chrome WebDriver instance with configured options
//        WebDriver driver = new ChromeDriver(options);
//
//        // Open a web page with a link to the file you want to download
//        driver.get("https://example.com/download");
//
//        // Find the link to the file and click on it
//        WebElement downloadLink = driver.findElement(By.linkText("Download File")); // Replace with the actual link text
//        downloadLink.click();
//
//        // Wait for the file to download (you may need to add a delay or use more advanced techniques)
//        // For simplicity, a static sleep is used here, but you may need to implement a more robust wait strategy
//        try {
//            Thread.sleep(10000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        // Get the downloaded file's name
//        String fileName = getLatestDownloadedFileName(downloadDirectory);
//
//        // Move the file to the preferred location
//        moveFile(downloadDirectory + File.separator + fileName, preferredLocation + File.separator + fileName);
//
//        // Close the browser window
//        driver.quit();
//    }
//
//    private static String getLatestDownloadedFileName(String directory) {
//        File dir = new File(directory);
//        File[] files = dir.listFiles();
//        
//        if (files != null && files.length > 0) {
//            // Assuming the latest file is the first one in the array
//            return files[0].getName();
//        } else {
//            throw new RuntimeException("No files found in the download directory.");
//        }
//    }
//
//    private static void moveFile(String sourcePath, String destinationPath) {
//        Path source = Paths.get(sourcePath);
//        Path destination = Paths.get(destinationPath);
//
//        try {
//            java.nio.file.Files.move(source, destination);
//            System.out.println("File moved successfully to: " + destinationPath);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
	}
}