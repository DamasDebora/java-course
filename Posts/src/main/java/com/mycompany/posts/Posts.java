/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.posts;

import entities.Comment;
import entities.Post;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author debora
 */
public class Posts {

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        
        Comment comment1 = new Comment("Have a nice trip!");
        Comment comment2 = new Comment("Wow! Awesome");
        
        Post post1 = new Post(
                sdf.parse("02/06/2023 16:20:02"), 
                "Mushrooms day", 
                "Wish me a good trip", 
                15);
        
        post1.addComment(comment1);
        post1.addComment(comment2);
        
        Comment comment3 = new Comment("lemme pet him");
        Comment comment4 = new Comment("so cute");
        
        Post post2 = new Post(
                sdf.parse("06/12/2021 13:05:09"), 
                "Ma dog", 
                "Is he cute?", 
                58);
        
        post2.addComment(comment3);
        post2.addComment(comment4);
        
        System.out.println(post1);
        System.out.println(post2);

    }
}
