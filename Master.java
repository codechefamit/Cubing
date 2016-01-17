/* Copyright (C) 2016 Amit Kothiyal - All Rights Reserved
 * You may use, distribute and modify this code under the
 * terms of the GNU license.
 */
class Master{
	public static void main(String args[])throws Exception{
		int ch;
		do{
		System.out.println("!!------Welcome to Prahalika------!!");
		System.out.println("!!-----(A Rubiks Cube Solver)-----!!");
		System.out.println("DEVELOPED BY:Amit Kothiyal");
		System.out.println("COPYRIGHT(C)");
		System.out.println("Press any key to continue...");
		System.in.read();
		Cube myCube=new Cube();
		myCube.initialize();
		ch=myCube.solve();
		}while(ch!=0);
}
}