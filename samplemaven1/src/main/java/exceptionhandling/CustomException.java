package exceptionhandling;

public class CustomException {

	public static void main(String[] args) throws VotingException {
		
		int age=16;
		if(age>18)
		{
			System.out.println("Eligible for Voting");
		}
		
		else 
		{
			throw new VotingException("NOT ELIGIBLE");
		}
		// TODO Auto-generated method stub

	}

}
