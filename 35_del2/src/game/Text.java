package game;

import java.util.Random;

public class Text {

	static String enterName1 = "Spiller 1 indtast navn";
	static String enterName2 = "Spiller 2 indtast navn";

	static String roll = " Tryk OK for at kaste terninger";	

	static String landedOn = " landede på:";

	static String winner = " vinder spillet!";
	
	static String tie = " vinder begge to!";


	public static int randomInteger(int min, int max) {
		Random rand = new Random();
		int randomNum = rand.nextInt((max - min) + 1) + min;
		return randomNum;
	}

	static String f01 = "";
	static String f02 = "";
	static String f03 = "";

	static String f11 = "";
	static String f12 = "";
	static String f13 = "";

	static String f21 = "Tårnet - 'Rapunzel, Rapunzel, lad dit hår falde ned', lyder det fra jorden udenfor vinduet. 'Et øjeblik',svarer du i en knap nok overbevisende falsk stemme, mens du fæstner din blonde tykke paryk og giver kneblen et par øve-sving. Et par minutter senere smider du den bevidstløse eventyrer på den støt stigende bunke af samme i hjørnet, og stikker hans penge i lommen. +250.";
	static String f22 = "";
	static String f23 = "";

	static String f31 = "Krateret - Du ankommer til Krateret, bydelens populæreste kro. Mens du bevæger dig gennem menneskemængden forbi baren, på vej ud på toilettet, lægger du mærke til at stede hovedsageligt er frekventeret af velklædte mænd. Ude i båsen ser du et hul i den ene væg, med teksten '100 daler pr mand' ridset i træværket underneden. 10 minutter senere forlader du krateret 100 daler fattigere, men i et glorværdigt humør! -100.";
	static String f32 = "";
	static String f33 = "";

	static String f41 = "Paladsets porte -  Ædle Kong Haargarn har bekendtgjort, at der skal holdes mesterskab i konkurrencespisning af skidne æg lige udenfor paladset, så han kan stå på sin balkon og pege og grine. Kongen er lidt underlig, men whatever, skidne æg er dit game og du vinder med lethed konkurrencen.  +100.";
	static String f42 = "";
	static String f43 = "";

	static String f51 = "Den Kolde Ørken - I din søgen har du formået at rode dig ud i en skidekold ørken. Efter mange timers vandren ser du en oase. Da du kommer nærmere viser det sig at oasen var et fatamogana, og at du rent faktisk står i en telefonboks. Du benytter lejligeden til at ringe efter en taxa. -20.";
	static String f52 = "";
	static String f53 = "";

	static String f61 = "Bymuren - Foran den enorme mur hiver du din lut frem over giver dig i kast med din rendering af 'Wonderwall' i håbet om at nogle af byens borgere deroppe vil betale dig for at holde op igen. En halv time senere er der gået sport i at kyle kobberstykker efter dig, og selvom du har erhvervet dig en del blå mærker, og muligvis en hjernerystelse har du reddet dig en god stak byttepenge. +180.";
	static String f62 = "";
	static String f63 = "";

	static String f71 = "Klosteret - Af uforklarlige årsager beslutter du dig for at gå i kloster og tager et fattighedsløfte. Du holder præcis én eftermiddag og det sidste munkene ser til dig, er da du, så hurtigt som dine ben kan bære dig, forsvinder over horisonten med en af deres øltønder over skulderen. +0.";
	static String f72 = "";
	static String f73 = "";

	static String f81 = "Den Sorte Grotte - Du stikker goblinen en nævefuld mønter og tager imod den lille pakke tryllestøv. Et par minutter senere sidder du ved dit bord i et mørkt hjørne og tager bane efter bane af det fortryllende stof. Du læner dig tilbage i sæddet og snart svæver du væk. Bogstaveligt talt. -70.";
	static String f82 = "";
	static String f83 = "";

	static String f91 = "Hytterne i Bjergne - Din afdøde tante har efterladt dig en forfalden hytte i bjergene. Den lader til at være hjemsted for en ekstremt sundhedsskadelig koloni af mugsporer. Du formår at sælge den som en timeshare til nogle turister fra landet og stikker 60 daler i lommen. Vi håber du er stolt af dig selv. +60.";
	static String f92 = "";
	static String f93 = "";

	static String f101 = "Varulvenes Mur - Mens du ihærdigt forsøger at forhandle en sørgelig gammel butiksbestyrerinde ned på en pris du ærligt talt burde skamme dig over at foreslå, lægge mærke til en flok særdeles behårede væsener, der kommer gående tværs over markedspladsen. Du genkender dit engangsknald fra tidligere blandet dem og skynder dig væk så hurtigt at du glemme din pung på disken. -80, Ekstra tur.";
	static String f102 = "";
	static String f103 = "";

	static String f111 = "Hullet - Du står i baren på kroen Det Bundløse Hul og gør et klodset forsøg på at imponere kromutter, da en sortelver smyger sig op ad dig. 'Passer det at de halvlange fra Herredet, ikke er så halvlange endda?', spørger hun. Du har aldrig været kræsen, så du betaler for din drink og går med sortelveren. Et par timer senere vågner du i et isbad, og ud fra det friske indsnit i din torso at dømme, er du ret sikker på at du mangler en nyre. 50.";
	static String f112 = "";
	static String f113 = "";

	static String f121 = "Guldminen - Et bagholdsangreb! Den fesne troldkarl Safronmand's horder af hærgende hårker vælter ind fra alle sider og samtlige medlemmer af dit eventyrergruppe går bravt til modangreb. Undtagen dig. Du træder snarrådigt ind bag et træ og gemmer dig i en mose. Da slaget er ovre træder du frem fra dit gemmested og går i gang med at lænse dine døde kammerater for værdigenstande. Du er rig! +650.";
	static String f122 = "";
	static String f123 = "";


	//The matrix "field" consists of 12 fields, with 4 texts each = field [4][12].
	static String[][] field = {
			{f01,f02,f03},{f11,f12,f13},{f21,f22,f23},{f31,f32,f33},{f41,f42,f43},{f51,f52,f53},{f61,f62,f63},
			{f71,f72,f73},{f81,f82,f83},{f91,f92,f93},{f101,f102,f103},{f111,f112,f113},{f121,f122,f123}
	};
}
