/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lloyd
 */
public class MCTest {
    
    List<MCQuestion> questionList;
    int correct;
    
    
    MCTest()
    {
        questionList = new ArrayList();
        correct = 0;
    }
    
    void add(MCQuestion myQuestion)
    {
        questionList.add(myQuestion);
    }
}
