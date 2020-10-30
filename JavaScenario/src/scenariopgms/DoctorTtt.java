package scenariopgms;

public class DoctorTtt extends Doctor
{
	public void designation(String designation)
	{
		System.out.println("doctor designation"+designation);
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		DoctorTtt doc = new DoctorTtt();
		doc.doctardetails("thiru", 23);
		doc.designation("MBBS");
		

	}

}
