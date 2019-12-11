package me.nbarudi.files.roles.Mafia;

import java.util.ArrayList;

import org.bukkit.ChatColor;

import me.nbarudi.files.roles.Role;
import me.nbarudi.files.roles.RoleAbilities;

public class Disguiser extends Role {

	public Disguiser(String name) {
		super(name);
		this.attack = 0;
		this.defense = 0;
		
		
		ArrayList<String> abil = new ArrayList<String>();
		abil.add("Choose a target to disguise yourself as.");
		
		ArrayList<String> atrib = new ArrayList<String>();
		atrib.add("You will appear to be the role of your target to the Investigator.");
		atrib.add("If you are killed you will appear to be the role of your target.");
		atrib.add("If there are no kill-capable Mafia roles left you will become a Mafioso.");
		atrib.add("You can talk with the other Mafia at night.");
		
		ArrayList<String> wincond = new ArrayList<String>();
		wincond.add("�cMafia");
		wincond.add("�6Survivor");
		wincond.add("�5Witch");
		
		this.teamname = "�cMafia";
		
		this.attributes = atrib;
		this.abilities = abil;
		this.winconditions = wincond;
		this.team = ChatColor.RED;
		this.ra = RoleAbilities.DISGUISE;
	}

}
