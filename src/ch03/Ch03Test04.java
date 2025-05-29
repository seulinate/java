package ch03;

public class Ch03Test04 {
	public static void main(String[] args) {
		int featureStatus =	12;	//현재 12
		int thirdFeatureStatus = (featureStatus & (1<<2) >> 2);
		if(thirdFeatureStatus == 1)	{
			System.out.println("세번째	기능이	활성화되어	있습니다.");
		}else {
			System.out.println("세번째	기능이	비활성화되어	있습니다.");
			}
		}
}
