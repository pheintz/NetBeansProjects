/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Lloyd
 */
public class MCQuestion 
{

    final int A = 1;
    final int B = 2;
    final int C = 3;
    final int D = 4;
    
    int correctAnswer;
    String question;
    
    String Answer1;
    String Answer2;
    String Answer3;
    String Answer4;
    
    MCQuestion(int cAnswer, String q, String a1, String a2, String a3, String a4)
    {
        correctAnswer = cAnswer;
        question = q;
        Answer1 = a1;
        Answer2 = a2;
        Answer3 = a3;
        Answer4 = a4;
    }
    
    
}
