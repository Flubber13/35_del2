package game;

import java.util.Random;

public class Text {

	static String enterName1 = "Spiller 1 indtast navn";
	static String enterName2 = "Spiller 2 indtast navn";

	static String roll = " Tryk OK for at kaste terninger";	

	static String winner = " vinder spillet!";

	
	public static int randomInteger(int min, int max) {
		Random rand = new Random();
		int randomNum = rand.nextInt((max - min) + 1) + min;
		return randomNum;
	}

	//The matrix "field" consists of 12 fields, with 4 texts each = field [4][12.
	static String[][] field = {
			//field0 and field1 -- EMPTY
			{"", "", "", ""}, {"", "", "", ""},
			//field2
			{" landede på: Tårnet - 'Rapunzel, Rapunzel, lad dit hår falde ned', lyder det fra jorden udenfor vinduet. 'Et øjeblik',svarer du i en knap nok overbevisende falsk stemme, mens du fæstner din blonde tykke paryk og giver kneblen et par øve-sving. Et par minutter senere smider du den bevidstløse eventyrer på den støt stigende bunke af samme i hjørnet, og stikker hans penge i lommen. +250.", 
			 " landede på tower 2", "landede på tower 3"},
			//field3
			{" landede på: Krateret - Du ankommer til Krateret, bydelens populæreste kro. Mens du bevæger dig gennem menneskemængden forbi baren, på vej ud på toilettet, lægger du mærke til at stede hovedsageligt er frekventeret af velklædte mænd. Ude i båsen ser du et hul i den ene væg, med teksten '100 daler pr mand' ridset i træværket underneden. 10 minutter senere forlader du krateret 100 daler fattigere, men i et glorværdigt humør! -100.", 
			" landede på cater 2", "landede på crater 3"},
			//field4
			{" landede på: Paladsets porte -  Ædle Kong Haargarn har bekendtgjort, at der skal holdes mesterskab i konkurrencespisning af skidne æg lige udenfor paladset, så han kan stå på sin balkon og pege og grine. Kongen er lidt underlig, men whatever, skidne æg er dit game og du vinder med lethed konkurrencen.  +100.", 
			" landede på gates 2", "landede på gates 3"},
			//field5
			{" landede på: Den Kolde Ørken - I din søgen har du formået at rode dig ud i en skidekold ørken. Efter mange timers vandren ser du en oase. Da du kommer nærmere viser det sig at oasen var et fatamogana, og at du rent faktisk står i en telefonboks. Du benytter lejligeden til at ringe efter en taxa. -20.", 
			" landede på desert 2", "landede på desert 3"},
			//field6
			{" landede på: Bymuren - Foran den enorme mur hiver du din lut frem over giver dig i kast med din rendering af 'Wonderwall' i håbet om at nogle af byens borgere deroppe vil betale dig for at holde op igen. En halv time senere er der gået sport i at kyle kobberstykker efter dig, og selvom du har erhvervet dig en del blå mærker, og muligvis en hjernerystelse har du reddet dig en god stak byttepenge. +180.", 
			" landede på city 2", "landede på city 3"},
			//field7
			{" landede på: Klosteret - Af uforklarlige årsager beslutter du dig for at gå i kloster og tager et fattighedsløfte. Du holder præcis én eftermiddag og det sidste munkene ser til dig, er da du, så hurtigt som dine ben kan bære dig, forsvinder over horisonten med en af deres øltønder over skulderen. +0.", 
			" landede på monestary 2", "landede på monestary 3"},
			//field8
			{" landede på: Den Sorte Grotte - Du stikker goblinen en nævefuld mønter og tager imod den lille pakke tryllestøv. Et par minutter senere sidder du ved dit bord i et mørkt hjørne og tager bane efter bane af det fortryllende stof. Du læner dig tilbage i sæddet og snart svæver du væk. Bogstaveligt talt. -70.", 
			" landede på cave 2", "landede på cave 3"},
			//field9
			{" landede på: Hytterne i Bjergne - Din afdøde tante har efterladt dig en forfalden hytte i bjergene. Den lader til at være hjemsted for en ekstremt sundhedsskadelig koloni af mugsporer. Du formår at sælge den som en timeshare til nogle turister fra landet og stikker 60 daler i lommen. Vi håber du er stolt af dig selv. +60.", 
			" landede på mountain 2", "landede på mountain 3"},
			//field10
			{" landede på: Varulvenes Mur - Mens du ihærdigt forsøger at forhandle en sørgelig gammel butiksbestyrerinde ned på en pris du ærligt talt burde skamme dig over at foreslå, lægge mærke til en flok særdeles behårede væsener, der kommer gående tværs over markedspladsen. Du genkender dit engangsknald fra tidligere blandet dem og skynder dig væk så hurtigt at du glemme din pung på disken. -80, Ekstra tur.", 
			" landede på wherewall 2", "landede på wherewall 3"},
			//field11
			{" landede på: Hullet - Du står i baren på kroen Det Bundløse Hul og gør et klodset forsøg på at imponere kromutter, da en sortelver smyger sig op ad dig. 'Passer det at de halvlange fra Herredet, ikke er så halvlange endda?', spørger hun. Du har aldrig været kræsen, så du betaler for din drink og går med sortelveren. Et par timer senere vågner du i et isbad, og ud fra det friske indsnit i din torso at dømme, er du ret sikker på at du mangler en nyre. 50.", 
			" landede på pit 2", "landede på pit 3"},
			//field12
			{" landede på: Guldminen - Et bagholdsangreb! Den fesne troldkarl Safronmand's horder af hærgende hårker vælter ind fra alle sider og samtlige medlemmer af dit eventyrergruppe går bravt til modangreb. Undtagen dig. Du træder snarrådigt ind bag et træ og gemmer dig i en mose. Da slaget er ovre træder du frem fra dit gemmested og går i gang med at lænse dine døde kammerater for værdigenstande. Du er rig! +650.", 
			" landede på goldmine 2", "landede på goldmine 3"},

	};
}
