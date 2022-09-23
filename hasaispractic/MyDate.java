package hasaispractic;

public class MyDate {
		int dd,mm,yy;
		public MyDate() {
			dd=11;
			mm=01;
			yy=1999;
		}
		public MyDate(int dd, int mm, int yy) {
			this.dd = dd;	//dd=11
			this.mm = mm;	//mm=01
			this.yy = yy;	//yy=1999
		}
	public void display()
	{
		System.out.println("Date : "+dd+"/"+mm+"/"+yy);
	}
}
