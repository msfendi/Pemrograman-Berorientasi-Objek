/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectrental;

/**
 *
 * @author User
 */
public class ProjectRental {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Membership member = new Membership();
        member.tambahMember(new DataMember("M001", "Mr. X", "Silver"));
        member.tambahMember(new DataMember("M002", "Mr. Y", "Gold"));
        member.tambahMember(new DataMember("M003", "Mr. Z", "Platinum"));
        
        DataMember data = member.inputMember();
        switch(data.Jenis) {
            case "Silver":
                Silver silver = new Silver(data);
                silver.hitungLayanan();
                silver.printSilver();
                break;
            case "Gold":
                Gold gold = new Gold(data);
                gold.hitungLayanan();
                gold.printGold();
                break;
            case "Platinum":
                Platinum platinum = new Platinum(data);
                platinum.hitungLayanan();
                platinum.printPlatinum();
                break;
            }
    }
    
}
