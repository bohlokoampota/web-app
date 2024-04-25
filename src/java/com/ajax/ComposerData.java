package com.ajax;

import java.util.HashMap;

/**
 *
 * @author nbuser
 */
public class ComposerData {
    
    private HashMap composers = new HashMap();
    

    public HashMap getComposers() {
        return composers;
    }
    
    public ComposerData() {
        
        composers.put("1", new Composer("1", "Thabo Tiheli", "Bach", "Baroque"));
        composers.put("2", new Composer("2", "Liomela", "Corelli", "Baroque"));
        composers.put("3", new Composer("3", "Koenametsing", "Handel", "Baroque"));
        composers.put("4", new Composer("4", "Henry", "Purcell", "Baroque"));
        composers.put("5", new Composer("5", "Karabo", "Rameau", "Baroque"));
        composers.put("6", new Composer("6", "Ranthumi", "Scarlatti", "Baroque"));
        composers.put("7", new Composer("7", "Tsiu", "Vivaldi", "Baroque"));

        composers.put("8", new Composer("8", "Lineo", "Beethoven", "Classical"));
        composers.put("9", new Composer("9", "Bokang", "Brahms", "Classical"));
        composers.put("10", new Composer("10", "Nyakallo", "Cavalli", "Classical"));
        composers.put("11", new Composer("11", "Nthekeleng Moea", "Chopin", "Classical"));
        composers.put("12", new Composer("12", "Khabiso", "Dvorak", "Classical"));
        composers.put("13", new Composer("13", "Lebone", "Haydn", "Classical"));
        composers.put("14", new Composer("14", "Boitumelo", "Mahler", "Classical"));
        composers.put("15", new Composer("15", "Khanya Letsie", "Mozart", "Classical"));
        composers.put("16", new Composer("16", "Liopelo", "Pachelbel", "Classical"));
        composers.put("17", new Composer("17", "Nthati", "Rossini", "Classical"));
        composers.put("18", new Composer("18", "Thato", "Shostakovich", "Classical"));
        composers.put("19", new Composer("19", "Richard", "Wagner", "Classical"));

        composers.put("20", new Composer("20", "Lebona", "Berlioz", "Romantic"));
        composers.put("21", new Composer("21", "Moeletsi", "Bizet", "Romantic"));
        composers.put("22", new Composer("22", "Majalle", "Cui", "Romantic"));
        composers.put("23", new Composer("23", "Thatohatsi", "Debussy", "Romantic"));
        composers.put("24", new Composer("24", "Refiloe", "Elgar", "Romantic"));
        composers.put("25", new Composer("25", "Gabriel", "Faure", "Romantic"));
        composers.put("26", new Composer("26", "Lebona", "Franck", "Romantic"));
        composers.put("27", new Composer("27", "Elelloang", "Grieg", "Romantic"));
        composers.put("28", new Composer("28", "Ntili", "Rimsky-Korsakov", "Romantic"));
        composers.put("29", new Composer("29", "Mathe Lira", "Liszt", "Romantic"));

        composers.put("30", new Composer("30", "Fumane", "Mendelssohn", "Romantic"));
        composers.put("31", new Composer("31", "Khethang", "Puccini", "Romantic"));
        composers.put("32", new Composer("32", "Tikoe", "Rachmaninoff", "Romantic"));
        composers.put("33", new Composer("33", "Shelile", "Saint-Saens", "Romantic"));
        composers.put("34", new Composer("34", "Fako", "Schubert", "Romantic"));
        composers.put("35", new Composer("35", "Robert", "Schumann", "Romantic"));
        composers.put("36", new Composer("36", "Jean", "Sibelius", "Romantic"));
        composers.put("37", new Composer("37", "Bohlale", "Smetana", "Romantic"));
        composers.put("38", new Composer("38", "Richard", "Strauss", "Romantic"));
        composers.put("39", new Composer("39", "Felleng", "Tchaikovsky", "Romantic"));
        composers.put("40", new Composer("40", "Botle", "Verdi", "Romantic"));

        composers.put("41", new Composer("41", "Bolae", "Bartok", "Post-Romantic"));
        composers.put("42", new Composer("42", "Likhabiso", "Bernstein", "Post-Romantic"));
        composers.put("43", new Composer("43", "Benjamin", "Britten", "Post-Romantic"));
        composers.put("44", new Composer("44", "John", "Cage", "Post-Romantic"));
        composers.put("45", new Composer("45", "Mohau", "Copland", "Post-Romantic"));
        composers.put("46", new Composer("46", "George", "Gershwin", "Post-Romantic"));
        composers.put("47", new Composer("47", "Lebo", "Prokofiev", "Post-Romantic"));
        composers.put("48", new Composer("48", "Mapalesa", "Ravel", "Post-Romantic"));
        composers.put("49", new Composer("49", "Katiso", "Stravinsky", "Post-Romantic"));
        composers.put("50", new Composer("50", "Karabelo", "Orff", "Post-Romantic"));
        
    }

}
