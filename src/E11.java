//ordenar numero romanos
import java.util.Scanner;
public class E11 {
	public void ejecutarE11(String[] args){
		String rom[]={"","I","II","III","IV","V","VI","VII","VIII","IX","X","XI","XII","XIII","XIV","XV","XVI","XVII","XVIII","XIX","XX","XXI","XXII","XXIII","XXIV","XXV","XXVI","XXVII","XXVIII","XXIX","XXX","XXXI","XXXII","XXXIII","XXXIV","XXXV","XXXVI","XXXVII","XXXVIII","XXXIX","XL","XLI","XLII","XLIII","XLIV","XLV","XLVI","XLVII","XLVIII","XLIX","L","LI","LII","LIII","LIV","LV","LVI","LVII","LVII","LIX","LX","LXI","LXII","LXIII","LXIV","LXV","LXVI","LXVII","LXVIII","LXIX","LXX","LXXI","LXXII","LXXIII","LXXIV","LXXV","LXXVI","LXXVII","LXXVIII","LXXIX","LXXX","LXXXI","LXXXII","LXXXIII","LXXXIV","LXXXV","LXXXVI","LXXXVII","LXXXVIII","LXXXIX","XC","XCI","XCII","XCIII","XCIV","XCV","XCVI","XCVII","XCVIII","XCIX","C"};
		String r[];
		String Ma;
		String me;
		int m[];
		m = new int[5];
		r = new String[5];
		Scanner s = new Scanner(System.in);
		System.out.println("Ingrese numeros romanos menores que 100:");
		r[0]=s.next();
		
		
		//
		
		int c;
		c=contador(r[0],rom[1]);
		System.out.print(c);
		
		//
		r[1]=s.next();
		r[2]=s.next();
		r[3]=s.next();
		r[4]=s.next();
		
		
	}
	public static int contador(String u,String m){
		int c=0;
		while(u!=m){
			c++;
		}
		return c;
		
	}

}
