package game;

import java.util.Random;

public class Text {
	/*This class contains all the text output for the game. 
	Putting it in one class will make is easier to change the language later.*/
	
	//The String in each of the following variables are pulled when referred to in the controller
	static String enterName1 = "Spiller 1 indtast navn";
	static String enterName2 = "Spiller 2 indtast navn";

	static String roll = " Tryk OK for at kaste terninger";	

	static String landedOn = " landede på:";

	static String winner = " vinder spillet!";
	
	static String tie = "Uafgjort";


	

	static String f01 = "";
	static String f02 = "";
	static String f03 = "";

	static String f11 = "";
	static String f12 = "";
	static String f13 = "";

	static String f21 = "Tårnet: 'Rapunzel, Rapunzel, lad dit hår falde ned', lyder det fra jorden udenfor vinduet. 'Et øjeblik', svarer du i en knap nok overbevisende falsetstemme, mens du fæstner din blonde paryk og giver kneblen et par øve-sving. Et par minutter senere smider du endnu en bevidstløs eventyrer på bunken. +250";
	static String f22 = "Tårnet: Med kraftanstrengelser kravler du op ad hårrebet og ind ad vinduet. Du ser til din skræk, at ’Rapunzel’ faktisk er en fedladen mand i en blond paryk. Du nedlægger ham promte med et hurtigt los i skridtet og erhverver dig mandens tegnebog. Et par minutter senere er du igen nede på jorden. +250";
	static String f23 = "";

	static String f31 = "Krateret: Du ankommer til den populære kro Krateret og lægger du mærke til at stedet kun er frekventeret af velklædte mænd. Ude på toilettet i båsen ser du et hul i den ene væg, med teksten '100 daler pr mand' ridset underneden. Efter 10 minutter forlader du kroen i et glorværdigt humør! -100";
	static String f32 = "Krateret: ’Vær nu sød’ tigger du hullet i væggen. Dette er mine sidste penge. Hvis jeg giver dig dem har jeg ikke til huslejen.’ ’100 daler’, gentager stemme fra den anden side af væggen blot. Du sukker og stikker en falsk seddel igennem hullet. -100";
	static String f33 = "";

	static String f41 = "Paladset: Ædle Kong Haargarn har bekendtgjort, at der skal holdes mesterskab i konkurrencespisning af skidne æg lige udenfor paladset, så han kan stå på sin balkon og pege og grine. Kongen er lidt underlig, men whatever, skidne æg er dit game og du vinder med lethed konkurrencen.  +100.";
	static String f42 = "Paladset: Du tilbringer dagen som levende statue foran paladset i håbet om at tjene lidt penge på det. Da du fejler miserabelt beslutter du dig for at stjæle en forbipasserende munks indsamlingsbøsse og gennem dig i en rosebusk i stedet. +100";
	static String f43 = "";

	static String f51 = "Ørkenen: I din søgen har du formået at rode dig ud i en skidekold ørken. Efter mange timers vandren ser du en oase. Da du kommer nærmere viser det sig at oasen var et fatamogana, og at du rent faktisk står i en telefonboks. Du benytter lejligeden til at ringe efter en taxa. -20";
	static String f52 = "Ørkenen: Det siges at man ikke må drikke havvand når man er havsnød, men der er ingen der har fortalt dig at man ikke må spise sand når man er blevet væk i en ørken. Det koster 20 daler at få nomadestammens medicinmand til at udpumpe din mave. -20";
	static String f53 = "";

	static String f61 = "Fortet: Du hiver din lut frem over giver dig i kast med din rendering af 'Wonderwall' i håbet om at nogen vil betale dig for at holde op igen. Lidt senere er der gået sport i at kyle kobberstykker efter dig, og selvom du har erhvervet dig en del blå mærker har du reddet dig en god stak ca$h. +180";
	static String f62 = "Fortet: ’Kom hid, kom hid’ råber du i retning mod menneskemængden der er på vej ind og ud ad byen. ’Find dronningen!’ råber du muntert mens du rykker rundt på de tre spillekort der ligger på dit lille spillebord. Du når at hustle et respektabelt antal borgere før byvagten jager dig væk. +180";
	static String f63 = "";

	static String f71 = "Klosteret: Af uforklarlige årsager beslutter du dig for at gå i kloster og tager et fattighedsløfte. Du holder præcis én eftermiddag og det sidste munkene ser til dig, er da du, så hurtigt som dine ben kan bære dig, forsvinder over horisonten med en af deres øltønder over skulderen. +0";
	static String f72 = "Klosteret: Abedissen er ikke voldsomt imponeret over din improviserede forelæsning om at det rent semantisk ikke kan læses ud fra ordet ’kloster’ om det huser munke eller nonner og du ser dig nødsaget til at flygte ud ad sovesalens vindue mens en skye af pile begraver sig i vindueskarmen bag dig. +0";
	static String f73 = "";

	static String f81 = "Den Sorte Grotte: Du stikker goblinen en nævefuld mønter og tager imod den lille pakke tryllestøv. Et par minutter senere sidder du ved dit bord i et mørkt hjørne og tager bane efter bane af det fortryllende stof. Du læner dig tilbage i sæddet og snart svæver du væk. Bogstaveligt talt. -70";
	static String f82 = "Den Sorte Grotte: ’Gør, eller gør ikke. Der er ingen at prøve’ siger den lille grønne mand. I et hjørnet spiller en dreng i briller, og med et lyn-formet ar dam med en mand i en sort overfrakke og solbriller. Du har blandet dine franchises sammen, eller også har nogen solgt dig dårlige svampe. -70";
	static String f83 = "";

	static String f91 = "Hytten: Din tante har efterladt dig en forfalden hytte i bjergene. Den lader til at være hjemsted for en ekstremt sundhedsskadelig koloni af mugsporer. Du formår at sælge den som en timeshare til nogle turister fra landet og stikker 60 daler i lommen. Vi håber du er stolt af dig selv. +60";
	static String f92 = "Hytten: ’Der er han!’ Råber de utilfredse turister du scammede tidligere i spillet. Efter en omgang verbal aikido har du solgt dem en mosforsikringspolice og du skynder dig ud ad byen. Hvis du ikke har været her før, så bare rolig. Du er blot fanget i et tidsparadoks. Det skal nok gå over. Tror vi. +60";
	static String f93 = "";

	static String f101 = "Varmuren: Mens du forsøger at forhandle en butiksbestyrerinde ned på en pris du ærligt talt burde skamme dig over, ser du en flok behårede væsener, der kommer gående over markedspladsen. Du genkender et tidligere engangsknald blandet dem og skynder dig væk. Du glemmer din pung. -80, Ekstra tur";
	static String f102 = "Varmuren: Du vågner i en seng med tømmermænd. Lugten af våd hund hænger i luften og der sover en stor, pelset skikkelse ved siden af dig. Med en stor erfaring sniger du dig ud ad sengen og ud ad et vindue. Du efterlader en håndfuld krøllede sedler på sengebordet. Man er vel gentleman. -80, Ekstra tur";
	static String f103 = "";

	static String f111 = "Guldminen: Bagholdsangreb! Den fesne troldkarl Safronmand's hærgende hårker vælter frem og hele din eventyrergruppe går bravt til modangreb. Undtagen dig. Du træder snarrådigt ind bag et træ og gemmer. Da slaget er ovre træder du frem og går i gang med at lænse dine døde kammerater for værdiger. +650";
	static String f112 = "Guldminen: Du franarrer de syv små dværge de lokale minerettigheder i den fortryllede skov. +650";
	static String f113 = "";

	static String f121 = "Hullet: Du står på kroen Hullet, da en sortelver henvender sig til dig. 'Passer det at de halvlange fra Herredet, ikke er så halvlange endda?' Du har aldrig været kræsen, så du går med sortelveren. Lidt senere vågner du i et isbad, med et friskt indsnit i din torso, og minus en nyre. -50";
	static String f122 = "Hullet: Då vågner i en grøft uden din pung. Igen. -50";
	static String f123 = "";


	//The matrix "field" consists of 12 fields, with 4 texts each = field [4][12].
	static String[][] field = {
			{f01,f02,f03},{f11,f12,f13},{f21,f22,f23},{f31,f32,f33},{f41,f42,f43},{f51,f52,f53},{f61,f62,f63},
			{f71,f72,f73},{f81,f82,f83},{f91,f92,f93},{f101,f102,f103},{f111,f112,f113},{f121,f122,f123}
	};
}
