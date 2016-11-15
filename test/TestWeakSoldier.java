package soldiers;

class TestWeakSoldier {
    
    //Test soldier's diplay
    public void testAffichage(){
	WeakSoldier ws1 = new WeakSoldier(50,10,"Jarvan");
	assert ws1.toString().equals("Name=Jarvan, HP=50, POWER=10") : "Error affichage";
    }
    
    //Test attack
    public void testSetterHp(){
	Soldier ws1 = new WeakSoldier(50,10,"1");
	Soldier ws2 = new WeakSoldier(50,10,"2");
	ws1.attack(ws2);
	assert ws2.getterHp() == 40 : "Error attack";
    }
    public static void main (String[] args)
    {
	boolean estMisAssertion = false;
	assert estMisAssertion = true;
	
	if (!estMisAssertion)
	    {
		System.out.println("Execution impossible sans l'option -ea");
		return;
	    }
	
        System.out.println("Begin testWeakSoldier");  
	System.out.println(".");       
	TestWeakSoldier testWeakSoldier1 = new TestWeakSoldier();
	testWeakSoldier1.testAffichage();
	System.out.println("Ok");       
	System.out.println(".");       
	TestWeakSoldier testWeakSoldier2 = new TestWeakSoldier();
	testWeakSoldier2.testSetterHp();
	System.out.println("Ok");       
	
	System.out.println("End testWeakSoldier");  

    }
}