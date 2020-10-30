package scenariopgms;

import java.util.ArrayList;
import java.util.Scanner;

public class cricketgame {
	
	static int no_of_players = 11;
	static String input_array[];

	static ArrayList<PlayerRuns> playerList = new ArrayList<PlayerRuns>();

	public static void main(String[] args)
        {
		getInput();
		enterRuns(playerList);
	}

	public static void enterRuns(ArrayList<PlayerRuns> playerlist)
         {
		System.out.println("Please choose one option");

		boolean flag = true;
		while (flag) {
			System.out
					.println("1) To enter runs for a player \n2) To view runs table\n3)To view specific player runs ");
			Scanner sc = new Scanner(System.in);
			int option = sc.nextInt();

			switch (option) {
			case 1:
				System.out.println("\nEnter the player number:");
				int playerNumber = sc.nextInt();
				for (PlayerRuns temp : playerlist) {
					if (temp.getPlayerNo() == playerNumber) {
						System.out.println("Enter runs for Player Name " + temp.getPlayerName());
						System.out.println("Enter the current ball runs");
						int run = sc.nextInt();
						if (run == 4) {
							temp.setNoOfFours(temp.getNoOfFours() + 1);
						}
						if (run == 6) {
							temp.setNoOfSixes(temp.getNoOfSixes() + 1);
						}
						temp.setTotalRuns(temp.getTotalRuns() + run);
						break;
					}
				}
				System.out.println("\nDo you wish to continue? please Y/N");
				if (sc.next().equals('N')) {
					flag = false;
				}

				break;
			case 2:
				System.out.println("\n\nRUNS TABLE ");
				System.out.println("NO  NAME  4's  6's  TotalRuns");
				for (PlayerRuns temp : playerlist) {
					System.out.println(temp.getPlayerNo() + "  " + temp.getPlayerName() + "\t" + temp.getNoOfFours()
							+ " " + temp.getNoOfSixes() +"\t"+ temp.getTotalRuns());
				}
				System.out.println("\nDo you wish to continue? please Y/N");
				if (sc.next().equals('N')) {
					flag = false;
				}
				break;

			case 3:
				System.out.println("\nEnter Player Number ");
				int playerno = sc.nextInt();
				for (PlayerRuns temp : playerlist) {
					if (temp.getPlayerNo() == playerno) {
						System.out.println(temp.getPlayerNo() + "  " + temp.getPlayerName() + "\t" + temp.getNoOfFours()
								+ " " + temp.getNoOfSixes());
					}
				}
				System.out.println("\nDo you wish to continue? please Y/N");
				if (sc.next().equals('N')) {
					flag = false;
				}
				break;

			}// switch
		} // while

	}

	public static void getInput() {
		System.out.println("Cricket Score calc \nPlease enter the number of players you want to enter runs\n");
		try {
			Scanner sc = new Scanner(System.in);
			no_of_players = sc.nextInt();

			if (no_of_players < 1 || no_of_players > 11) {
				throw new NumberFormatException();
			}

			System.out.println("\nPlease start entering the player details ");
			System.out.println("Enter only the player names");

			for (int i = 0; i < no_of_players; i++) {
				int temp = 1;
				System.out.println("Player No " + (temp += i) + ")");
				playerList.add(new PlayerRuns(temp, sc.next(), 0, 0, 0));
			}
			System.out.println("\nYou have entered the following Players ");
			for (PlayerRuns t : playerList) {
				System.out.println(t.getPlayerNo() + "\t" + t.getPlayerName());
			}

		} catch (NumberFormatException e) {
			System.out.println("The number of players should be between  (between 1 to 11)");
		} catch (Exception e) {
			System.out.println("This is an invalid input ");
		}

	}

}

class PlayerRuns {
	private int playerNo;
	private String playerName;
	private int totalRuns;
	private int noOfFours;
	private int noOfSixes;

	public PlayerRuns() {
	}

	public PlayerRuns(int playerNo, String playerName, int totalRuns, int noOfFours, int noOfSixes) {
		super();
		this.playerNo = playerNo;
		this.playerName = playerName;
		this.totalRuns = totalRuns;
		this.noOfFours = noOfFours;
		this.noOfSixes = noOfSixes;
	}

	public int getPlayerNo() {
		return playerNo;
	}

	public void setPlayerNo(int playerNo) {
		this.playerNo = playerNo;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getTotalRuns() {
		return totalRuns;
	}

	public void setTotalRuns(int totalRuns) {
		this.totalRuns = totalRuns;
	}

	public int getNoOfFours() {
		return noOfFours;
	}

	public void setNoOfFours(int noOfFours) {
		this.noOfFours = noOfFours;
	}

	public int getNoOfSixes() {
		return noOfSixes;
	}

	public void setNoOfSixes(int noOfSixes) {
		this.noOfSixes = noOfSixes;
	}

}
