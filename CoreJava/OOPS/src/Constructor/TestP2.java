package Constructor;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestP2 {
	public static void main(String[] args) throws ParseException {

		Person2 p = new Person2();

		String s = "25.07.96";

		SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yy");

		Date d = sdf.parse(s);

		p.setName("aakash");
		p.setDob(d);

		System.out.println(p.getName());
		System.out.println(p.getDob());

	}

}
