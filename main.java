import java.util.Arrays;
import java.util.Comparator;
import java.util.Calendar;

class MyComp implements Comparator<String>
{

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		int p1=0, p2=0;
		String[] b = new String[]{"January", "February", "Mart", "April","May","June", "Jule","August","September","October","November", "December"};
		for (int i=0;i<12;i++){
			if (o1.equals(b[i])){p1=i;}
			if (o2.equals(b[i])){p2=i;}
		}
		return (int) Math.signum(p1-p2);
	}

}

public class main {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] months = new String [] {"June", "September", "April","December", "Jule"};
		String[] m2 = new String[months.length];
		m2 = months.clone();
		MyComp c = new MyComp();
		Arrays.sort(m2, c);
		for(int i=0;i<m2.length;i++){
			System.out.println(m2[i]);
		}
	}

}