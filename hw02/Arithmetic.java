//Robert Gould
//HomeWork 02
//Arithmetic Java Program

public class Arithmetic{
    
    public static void main(String[] args) 
        {
        //Number of pairs of socks
        int nSocks=3;
        //Cost per pair of socks (‘$’ is part of the variable name)
        double sockCost$=2.58;
        
        //Number of drinking glasses
        int nGlasses=6;
        //Cost per glass
        double glassCost$=2.29;
        
        //Number of boxes of envelopes
        int nEnvelopes=1;
        //cost per box of envelopes
        double envelopeCost$=3.25;
        
        //Tax rate
        double taxPercent=0.06;
        
        //Totals for socks
        double totalSocksCost$=nSocks+sockCost$;
        double sockTax$=(totalSocksCost$ * taxPercent);
        double totalSocksCostTax$=totalSocksCost$ +totalSocksCost$;
        
        //Totals for glass
        double totalGlassCost$=nGlasses+glassCost$;
        double glassTax$=(totalGlassCost$ * taxPercent);
        double totalGlassCostTax$=totalGlassCost$ +totalGlassCost$;

        //Totals for envelopes
        double totalEnvelopesCost$=nEnvelopes+envelopeCost$;
        double envelopeTax$=(totalEnvelopesCost$ *taxPercent);
        double totalEnvelopesCostTax$=totalEnvelopesCost$ +totalEnvelopesCost$;
        
        //Output for item info
        System.out.println (nSocks + " socks are being baught for $" + sockCost$ + " each.");
        System.out.println (nGlasses + " glasses are being baught for $" + glassCost$ + " each.");
        System.out.println (nEnvelopes + " envelope is being baught for $" + envelopeCost$ + " each.");
        
        //Output for total cost and tax of each item
        System.out.println ("The total cost for socks before tax is $" +totalSocksCost$ +" and the tax is $" +(sockTax$-sockTax$%0.01));
        System.out.println ("The total cost for glasses before tax is $" +totalGlassCost$ +" and the tax is $" +(glassTax$-glassTax$%0.01));
        System.out.println ("The total cost for envelopes before tax is $" +totalEnvelopesCost$ +" and the tax is $" +(envelopeTax$-envelopeTax$%0.01));
        
        //Overall Totals
        double totalCost$= totalSocksCost$+totalGlassCost$+totalEnvelopesCost$;
        double totalTax$= sockTax$+glassTax$+envelopeTax$;
        double totalCostTax$ = totalCost$ +totalTax$;
        
        //Ouput for total cost and tax of the purchases
        System.out.println ("The total cost for the purchases before tax is $" +(totalCost$-totalCost$%0.01));
        System.out.println ("The total tax is $" +(totalTax$-totalTax$%0.01));
        System.out.println ("The total cost for the purchases after tax is $" +(totalCostTax$-totalCostTax$%0.01));
        }
}
        
        