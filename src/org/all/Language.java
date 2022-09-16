package org.all;

public class Language extends StateDetails {
public void southIndia() {
	System.out.println("This all are south indian languages");
}
   private void tamilLanguage() {
	System.out.println("Tamil is a mother of all languages");

}
   private void engilshLanguage() {
	System.out.println("Englis is a globallanguage");

}
   private void hindiLanguage() {
	System.out.println("Hndi is our national language");

}
public static void main(String[] args) {
	Language lg= new Language();
	lg.southIndia();
	lg.tamilLanguage();
	lg.engilshLanguage();
	lg.hindiLanguage();
	lg.northIndia();
	lg.southIndia1();
	
}
}
