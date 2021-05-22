package org.college;

public class College {
	
	public String collegeName(String cname)
	{
		
		System.out.println(cname);
		return cname;
		
	}
	public void collegeCode(String code)
	{
		
		System.out.println(code);
		//return cname;
		
	}
	public int collegeRank(int rank) {
		// TODO Auto-generated method stub
		System.out.println(rank);	
		return rank;
        
        }
	
	
	public static void main(String[] args) {
	
		College name=new College();
		name.collegeName("CKcet");
		name.collegeCode("3511");
		name.collegeRank(355);
		
	}
	
	

}
