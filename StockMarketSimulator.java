/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stockmarketsimulator;

import java.util.ArrayList;
import java.util.List;
import com.intelligence_1.stockmarketsimulator.model.companies.Company;
import com.intelligence_1.stockmarketsimulator.model.companies.CompanyObserver;
import com.intelligence_1.stockmarketsimulator.model.companies.MyBlog;
import com.intelligence_1.stockmarketsimulator.model.companies.MyBlogSubscriber;
import com.intelligence_1.stockmarketsimulator.model.companies.Observer;
import com.intelligence_1.stockmarketsimulator.model.companies.Subject;
import com.intelligence_1.stockmarketsimulator.model.investors.Investor;

/**
 *
 * @author guerr
 */
public class StockMarketSimulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        List<Subject> c = new ArrayList<Subject>();
        
        c.add(new Company.CompanyBuilder("Alpha", 100, 100).build());
        c.add(new Company.CompanyBuilder("Alpha", 100, 100).build());
        c.add(new Company.CompanyBuilder("Alpha", 100, 100).build());
        c.add(new Company.CompanyBuilder("Alpha", 100, 100).build());
        c.add(new Company.CompanyBuilder("Alpha", 100, 100).build());
        c.add(new Company.CompanyBuilder("Alpha", 100, 100).build());
        c.add(new Company.CompanyBuilder("Alpha", 100, 100).build());
        c.add(new Company.CompanyBuilder("Alpha", 100, 100).build());
        c.add(new Company.CompanyBuilder("Alpha", 100, 100).build());
        c.add(new Company.CompanyBuilder("Alpha", 100, 100).build());
        
        new CompanyObserver(c);
        
        for (Subject a : c) {
            System.out.println(((Company)a).getSharePrice());
        }
        
        ((Company)c.get(0)).soldAShare();
        ((Company)c.get(0)).soldAShare();
        ((Company)c.get(0)).soldAShare();
        ((Company)c.get(0)).soldAShare();
        ((Company)c.get(0)).soldAShare();
        ((Company)c.get(0)).soldAShare();
        ((Company)c.get(0)).soldAShare();
        ((Company)c.get(0)).soldAShare();
        ((Company)c.get(0)).soldAShare();
        ((Company)c.get(0)).soldAShare();
        
        
        System.out.println("---------------------------------------");
        for (Subject a : c) {
            System.out.println(((Company)a).getSharePrice());
        }
        
            
    }    
        
    
    
}
