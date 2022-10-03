
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
-----------------------
DOCUMENTATION
-----------------------
03/14/2022 Bug fix.
    - Added comments.
    - Added Phoenix to be checked if selected first.
03/20/2022 Added Features
    - Added separate buttons for randomizing
    - Refined code for second agent
04/29/2022
    - Added Fade
05/06/2022
    - Shorten code using OOP
    - Create two methods: AgentCheck, AgentAdd, and Reset
    - Added functions such as All Duelists, All Controllers, All Initators, and all Sentinels
10/04/2022
    - Added a new button "NEW META" includes one Duelist, one Sentinel, one Controller, and two Initiators
    - Properly renamed the button functions
*/

/**
 *
 * @author Lord Julius
 */
public class RandomAgentGenerator extends javax.swing.JFrame {

    /**
     * Creates new form RandomAgentGenerator
     */
    public RandomAgentGenerator() throws FileNotFoundException {
        initComponents();
    }
    
    int counter = 0; //Counter for the shuffling
    String first, second, third, fourth, fifth; //first variable is the first selected agent
    
    public void AgentCheck (String num) {
        //Code to putting a check on selected agents
             if (null != num) switch (num) {
            case "Astra":
                Astra.setSelected(true);
                break;
            case "Breach":
                Breach.setSelected(true);
                break;
            case "Brimstone":
                Brimstone.setSelected(true);
                break;
            case "Chamber":
                Chamber.setSelected(true);
                break;
            case "Cypher":
                Cypher.setSelected(true);
                break;
            case "Fade":
                Fade.setSelected(true);
                break;
            case "Jett":
                Jett.setSelected(true);
                break;
            case "Kay/0":
                KAYO.setSelected(true);
                break;
            case "Neon":
                Neon.setSelected(true);
                break;
            case "Killjoy":
                Killjoy.setSelected(true);
                break;
            case "Omen":
                Omen.setSelected(true);
                break;
            case "Phoenix":
                Phoenix.setSelected(true);
                break;
            case "Raze":
                Raze.setSelected(true);
                break;
            case "Reyna":
                Reyna.setSelected(true);
                break;
            case "Sage":
                Sage.setSelected(true);
                break;
            case "Skye":
                Skye.setSelected(true);
                break;
            case "Sova":
                Sova.setSelected(true);
                break;
            case "Viper":
                Viper.setSelected(true);
                break;
            case "Yoru":
                Yoru.setSelected(true);
                break;
            case "Your Choice":
                Your_Choice.setSelected(true);
                break;
            default:
                break;
        }
    }
    
    public ArrayList AgentAdd () {
        //Code to adding all agents to list
         ArrayList<String> agentsList = new ArrayList<String>();
                        
                        if (Astra.isSelected() != true) {
                           agentsList.add("Astra");
                         }
                         if (Breach.isSelected() != true) {
                           agentsList.add("Breach");
                         }
                         if (Brimstone.isSelected() != true) {
                           agentsList.add("Brimstone");
                         }
                         if (Chamber.isSelected() != true) {
                           agentsList.add("Chamber");
                         }
                         if (Cypher.isSelected() != true) {
                           agentsList.add("Cypher");
                         }
                         if (Fade.isSelected() !=true) {
                             agentsList.add("Fade");
                         }
                         if (Jett.isSelected() != true) {
                           agentsList.add("Jett");
                         }
                         if (KAYO.isSelected() != true) {
                           agentsList.add("Kay/0");
                         }
                         if (Neon.isSelected() !=true) {
                             agentsList.add("Neon");
                         }
                         if (Killjoy.isSelected() != true) {
                           agentsList.add("Killjoy");
                         }
                         if (Omen.isSelected() != true) {
                           agentsList.add("Omen");
                         }
                         if (Phoenix.isSelected() != true) {
                           agentsList.add("Phoenix");
                         }
                         if (Raze.isSelected() != true) {
                           agentsList.add("Raze");
                         }
                         if (Reyna.isSelected() != true) {
                           agentsList.add("Reyna");
                         }
                         if (Sage.isSelected() != true) {
                           agentsList.add("Sage");
                         }
                         if (Skye.isSelected() != true) {
                           agentsList.add("Skye");
                         }
                         if (Sova.isSelected() != true) {
                           agentsList.add("Sova");
                         }
                         if (Viper.isSelected() != true) {
                           agentsList.add("Viper");
                         }
                         if (Yoru.isSelected() != true) {
                           agentsList.add("Yoru");
                         }
                         if (Your_Choice.isSelected() != true) {
                           agentsList.add("Your Choice");
                         }
        return agentsList;
        
    }
    
    public void Reset () {
        // Code to reset the selected agents, the first agent, and the counter.
        Astra.setSelected(false);
        Breach.setSelected(false);
        Brimstone.setSelected(false);
        Chamber.setSelected(false);
        Cypher.setSelected(false);
        Fade.setSelected(false);
        Jett.setSelected(false);
        KAYO.setSelected(false);
        Killjoy.setSelected(false);
        Neon.setSelected(false);
        Omen.setSelected(false);
        Phoenix.setSelected(false);
        Raze.setSelected(false);
        Reyna.setSelected(false);
        Sage.setSelected(false);
        Skye.setSelected(false);
        Sova.setSelected(false);
        Viper.setSelected(false);
        Yoru.setSelected(false);
        Your_Choice.setSelected(false);
        Output.setText("");
        first = "";
        second = "";
        third = "";
        fourth = "";
        fifth = "";
        counter = 0;
        
    }
  


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        RandomizeBtn = new javax.swing.JButton();
        ResetBtn = new javax.swing.JButton();
        QuitBtn = new javax.swing.JButton();
        SubtitleLbl1 = new javax.swing.JLabel();
        TitleLbl1 = new javax.swing.JLabel();
        Astra = new javax.swing.JCheckBox();
        Breach = new javax.swing.JCheckBox();
        Brimstone = new javax.swing.JCheckBox();
        Cypher = new javax.swing.JCheckBox();
        Jett = new javax.swing.JCheckBox();
        KAYO = new javax.swing.JCheckBox();
        Killjoy = new javax.swing.JCheckBox();
        Omen = new javax.swing.JCheckBox();
        Phoenix = new javax.swing.JCheckBox();
        Raze = new javax.swing.JCheckBox();
        Reyna = new javax.swing.JCheckBox();
        Sage = new javax.swing.JCheckBox();
        Skye = new javax.swing.JCheckBox();
        Sova = new javax.swing.JCheckBox();
        Yoru = new javax.swing.JCheckBox();
        Chamber = new javax.swing.JCheckBox();
        Neon = new javax.swing.JCheckBox();
        RandomizeBtn2 = new javax.swing.JButton();
        Your_Choice = new javax.swing.JCheckBox();
        RandomizeBtn3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Output = new javax.swing.JTextArea();
        RandomizeBtn4 = new javax.swing.JButton();
        RandomizeBtn5 = new javax.swing.JButton();
        Viper = new javax.swing.JCheckBox();
        Fade = new javax.swing.JCheckBox();
        RandomizeBtn6 = new javax.swing.JButton();
        RandomizeBtn7 = new javax.swing.JButton();
        RandomizeBtn8 = new javax.swing.JButton();
        RandomizeBtn9 = new javax.swing.JButton();
        RandomizeBtn10 = new javax.swing.JButton();
        RandomizeBtn11 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Random Agent Generator");
        setBackground(new java.awt.Color(250, 68, 84));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(250, 68, 84));
        jPanel1.setForeground(new java.awt.Color(250, 68, 84));

        RandomizeBtn.setBackground(new java.awt.Color(183, 132, 96));
        RandomizeBtn.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        RandomizeBtn.setText("1 Agent");
        RandomizeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OneAgentShuffle(evt);
            }
        });

        ResetBtn.setBackground(new java.awt.Color(183, 132, 96));
        ResetBtn.setFont(new java.awt.Font("Bahnschrift", 1, 11)); // NOI18N
        ResetBtn.setText("Reset");
        ResetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetBtnActionPerformed(evt);
            }
        });

        QuitBtn.setBackground(new java.awt.Color(183, 132, 96));
        QuitBtn.setFont(new java.awt.Font("Bahnschrift", 1, 11)); // NOI18N
        QuitBtn.setText("Quit");
        QuitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuitBtnActionPerformed(evt);
            }
        });

        SubtitleLbl1.setFont(new java.awt.Font("Bahnschrift", 1, 11)); // NOI18N
        SubtitleLbl1.setForeground(new java.awt.Color(54, 73, 102));
        SubtitleLbl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SubtitleLbl1.setText("Which Agents have been selected?");

        TitleLbl1.setBackground(new java.awt.Color(183, 132, 96));
        TitleLbl1.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        TitleLbl1.setForeground(new java.awt.Color(54, 73, 102));
        TitleLbl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitleLbl1.setText("Random Agent Selector");
        TitleLbl1.setOpaque(true);

        Astra.setFont(new java.awt.Font("Bahnschrift", 1, 11)); // NOI18N
        Astra.setForeground(new java.awt.Color(17, 32, 28));
        Astra.setText("Astra");

        Breach.setFont(new java.awt.Font("Bahnschrift", 1, 11)); // NOI18N
        Breach.setForeground(new java.awt.Color(17, 32, 28));
        Breach.setText("Breach");

        Brimstone.setFont(new java.awt.Font("Bahnschrift", 1, 11)); // NOI18N
        Brimstone.setForeground(new java.awt.Color(17, 32, 28));
        Brimstone.setText("Brimstone");

        Cypher.setFont(new java.awt.Font("Bahnschrift", 1, 11)); // NOI18N
        Cypher.setForeground(new java.awt.Color(17, 32, 28));
        Cypher.setText("Cypher");

        Jett.setFont(new java.awt.Font("Bahnschrift", 1, 11)); // NOI18N
        Jett.setForeground(new java.awt.Color(17, 32, 28));
        Jett.setText("Jett");

        KAYO.setFont(new java.awt.Font("Bahnschrift", 1, 11)); // NOI18N
        KAYO.setForeground(new java.awt.Color(17, 32, 28));
        KAYO.setText("Kay/0");

        Killjoy.setFont(new java.awt.Font("Bahnschrift", 1, 11)); // NOI18N
        Killjoy.setForeground(new java.awt.Color(17, 32, 28));
        Killjoy.setText("Killjoy");
        Killjoy.setToolTipText("");

        Omen.setFont(new java.awt.Font("Bahnschrift", 1, 11)); // NOI18N
        Omen.setForeground(new java.awt.Color(17, 32, 28));
        Omen.setText("Omen");

        Phoenix.setFont(new java.awt.Font("Bahnschrift", 1, 11)); // NOI18N
        Phoenix.setForeground(new java.awt.Color(17, 32, 28));
        Phoenix.setText("Phoenix");

        Raze.setFont(new java.awt.Font("Bahnschrift", 1, 11)); // NOI18N
        Raze.setForeground(new java.awt.Color(17, 32, 28));
        Raze.setText("Raze");

        Reyna.setFont(new java.awt.Font("Bahnschrift", 1, 11)); // NOI18N
        Reyna.setForeground(new java.awt.Color(17, 32, 28));
        Reyna.setText("Reyna");

        Sage.setFont(new java.awt.Font("Bahnschrift", 1, 11)); // NOI18N
        Sage.setForeground(new java.awt.Color(17, 32, 28));
        Sage.setText("Sage");

        Skye.setFont(new java.awt.Font("Bahnschrift", 1, 11)); // NOI18N
        Skye.setForeground(new java.awt.Color(17, 32, 28));
        Skye.setText("Skye");

        Sova.setFont(new java.awt.Font("Bahnschrift", 1, 11)); // NOI18N
        Sova.setForeground(new java.awt.Color(17, 32, 28));
        Sova.setText("Sova");

        Yoru.setFont(new java.awt.Font("Bahnschrift", 1, 11)); // NOI18N
        Yoru.setForeground(new java.awt.Color(17, 32, 28));
        Yoru.setText("Yoru");

        Chamber.setFont(new java.awt.Font("Bahnschrift", 1, 11)); // NOI18N
        Chamber.setForeground(new java.awt.Color(17, 32, 28));
        Chamber.setText("Chamber");
        Chamber.setToolTipText("");

        Neon.setFont(new java.awt.Font("Bahnschrift", 1, 11)); // NOI18N
        Neon.setForeground(new java.awt.Color(17, 32, 28));
        Neon.setText("Neon");

        RandomizeBtn2.setBackground(new java.awt.Color(183, 132, 96));
        RandomizeBtn2.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        RandomizeBtn2.setText("2 Agents");
        RandomizeBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TwoAgentShuffle(evt);
            }
        });

        Your_Choice.setFont(new java.awt.Font("Bahnschrift", 1, 11)); // NOI18N
        Your_Choice.setForeground(new java.awt.Color(17, 32, 28));
        Your_Choice.setText("Your Choice");

        RandomizeBtn3.setBackground(new java.awt.Color(183, 132, 96));
        RandomizeBtn3.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        RandomizeBtn3.setText("3 Agents");
        RandomizeBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThreeAgentShuffle(evt);
            }
        });

        Output.setEditable(false);
        Output.setBackground(new java.awt.Color(255, 204, 204));
        Output.setColumns(20);
        Output.setFont(new java.awt.Font("Bahnschrift", 1, 13)); // NOI18N
        Output.setRows(5);
        jScrollPane1.setViewportView(Output);

        RandomizeBtn4.setBackground(new java.awt.Color(183, 132, 96));
        RandomizeBtn4.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        RandomizeBtn4.setText("4 Agents");
        RandomizeBtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FourAgentShuffle(evt);
            }
        });

        RandomizeBtn5.setBackground(new java.awt.Color(183, 132, 96));
        RandomizeBtn5.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        RandomizeBtn5.setText("5 Agents");
        RandomizeBtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FiveAgentShuffle(evt);
            }
        });

        Viper.setFont(new java.awt.Font("Bahnschrift", 1, 11)); // NOI18N
        Viper.setForeground(new java.awt.Color(17, 32, 28));
        Viper.setText("Viper");

        Fade.setFont(new java.awt.Font("Bahnschrift", 1, 11)); // NOI18N
        Fade.setForeground(new java.awt.Color(17, 32, 28));
        Fade.setText("Fade");

        RandomizeBtn6.setBackground(new java.awt.Color(54, 73, 102));
        RandomizeBtn6.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        RandomizeBtn6.setForeground(new java.awt.Color(255, 255, 255));
        RandomizeBtn6.setText("All Duelists");
        RandomizeBtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AllDuelistsShuffle(evt);
            }
        });

        RandomizeBtn7.setBackground(new java.awt.Color(54, 73, 102));
        RandomizeBtn7.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        RandomizeBtn7.setForeground(new java.awt.Color(255, 255, 255));
        RandomizeBtn7.setText("All Controllers");
        RandomizeBtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AllControllersShuffle(evt);
            }
        });

        RandomizeBtn8.setBackground(new java.awt.Color(54, 73, 102));
        RandomizeBtn8.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        RandomizeBtn8.setForeground(new java.awt.Color(255, 255, 255));
        RandomizeBtn8.setText("All Initiators");
        RandomizeBtn8.setToolTipText("");
        RandomizeBtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AllInitiatorsShuffle(evt);
            }
        });

        RandomizeBtn9.setBackground(new java.awt.Color(54, 73, 102));
        RandomizeBtn9.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        RandomizeBtn9.setForeground(new java.awt.Color(255, 255, 255));
        RandomizeBtn9.setText("All Sentinels");
        RandomizeBtn9.setToolTipText("");
        RandomizeBtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AllSentinelsShuffle(evt);
            }
        });

        RandomizeBtn10.setBackground(new java.awt.Color(4, 46, 39));
        RandomizeBtn10.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        RandomizeBtn10.setForeground(new java.awt.Color(255, 255, 255));
        RandomizeBtn10.setText("Perfect Team Shuffle");
        RandomizeBtn10.setToolTipText("");
        RandomizeBtn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PerfectTeamShuffle(evt);
            }
        });

        RandomizeBtn11.setBackground(new java.awt.Color(255, 222, 0));
        RandomizeBtn11.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        RandomizeBtn11.setForeground(new java.awt.Color(210, 0, 26));
        RandomizeBtn11.setText("NEW META");
        RandomizeBtn11.setToolTipText("");
        RandomizeBtn11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RandomizeBtn11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TitleLbl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(SubtitleLbl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(ResetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(QuitBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(RandomizeBtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(RandomizeBtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(RandomizeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(RandomizeBtn2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(RandomizeBtn3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(RandomizeBtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(RandomizeBtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(RandomizeBtn10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(RandomizeBtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(RandomizeBtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(Brimstone)
                                            .addComponent(Breach)
                                            .addComponent(Astra)
                                            .addComponent(Chamber)
                                            .addComponent(Jett))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(Omen)
                                                    .addComponent(Neon)
                                                    .addComponent(Killjoy)
                                                    .addComponent(Raze)
                                                    .addComponent(Phoenix)
                                                    .addComponent(Your_Choice)))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(KAYO))))
                                    .addComponent(Fade)
                                    .addComponent(Cypher))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Sova)
                                    .addComponent(Yoru)
                                    .addComponent(Viper)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(Reyna)
                                        .addComponent(Sage, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Skye, javax.swing.GroupLayout.Alignment.LEADING))))
                            .addComponent(RandomizeBtn11, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(TitleLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SubtitleLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Astra)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Breach))
                            .addComponent(Sage, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Brimstone)
                            .addComponent(Neon)
                            .addComponent(Skye)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(KAYO)
                            .addComponent(Reyna))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Killjoy)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Chamber)
                    .addComponent(Omen)
                    .addComponent(Sova))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Cypher)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Phoenix)
                        .addComponent(Viper)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Fade)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Raze)
                        .addComponent(Yoru)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jett)
                    .addComponent(Your_Choice))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RandomizeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RandomizeBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RandomizeBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RandomizeBtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RandomizeBtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RandomizeBtn6)
                    .addComponent(RandomizeBtn7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RandomizeBtn8)
                    .addComponent(RandomizeBtn9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RandomizeBtn10, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(RandomizeBtn11, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ResetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(QuitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void OneAgentShuffle(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OneAgentShuffle
        ArrayList agentsList = AgentAdd();

        if (agentsList.size() < 1) {
            
            JOptionPane.showMessageDialog(null, "Why did you select everything? Stupid.",
                            "Error", JOptionPane.ERROR_MESSAGE);
            
            Output.setText("Wara bugoa ka!");
         } else {
                      Collections.shuffle(agentsList); //Code to shuffle
                      //Get the first agent on the shuffled list
                      first = (String) agentsList.get(0);
                      AgentCheck(first);
                      Output.setText(first);
                  
        }
    }//GEN-LAST:event_OneAgentShuffle

    private void ResetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetBtnActionPerformed
        Reset();
    }//GEN-LAST:event_ResetBtnActionPerformed

    private void QuitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuitBtnActionPerformed
        // Code to quit.
        System.exit(0);
    }//GEN-LAST:event_QuitBtnActionPerformed

    private void TwoAgentShuffle(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TwoAgentShuffle
        ArrayList agentsList = AgentAdd();

        if (agentsList.size() < 2) {
            
            JOptionPane.showMessageDialog(null, "Why did you select everything? Stupid.",
                            "Error", JOptionPane.ERROR_MESSAGE);
            
            Output.setText("Wara bugoa ka!");
         } else {
                      Collections.shuffle(agentsList); //Code to shuffle
                      //Get the first agent on the shuffled list
                      first = (String) agentsList.get(0);
                      second = (String) agentsList.get(1);
                      AgentCheck(first);
                      AgentCheck(second);
                      Output.setText(first + "\n" + second);
                  
        }
    }//GEN-LAST:event_TwoAgentShuffle

    private void ThreeAgentShuffle(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThreeAgentShuffle
        ArrayList agentsList = AgentAdd();

        if (agentsList.size() < 3) {
            
            JOptionPane.showMessageDialog(null, "Why did you select everything? Stupid.",
                            "Error", JOptionPane.ERROR_MESSAGE);
            
            Output.setText("Wara bugoa ka!");
         } else {
                      Collections.shuffle(agentsList); //Code to shuffle
                      //Get the first agent on the shuffled list
                      first = (String) agentsList.get(0);
                      second = (String) agentsList.get(1);
                      third = (String) agentsList.get(2);
                      AgentCheck(first);
                      AgentCheck(second);
                      AgentCheck(third);
                      Output.setText(first+ "\n" + second + "\n" + third);
                  
        }
    }//GEN-LAST:event_ThreeAgentShuffle

    private void FourAgentShuffle(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FourAgentShuffle
         ArrayList agentsList = AgentAdd();

        if (agentsList.size() < 4) {
            
            JOptionPane.showMessageDialog(null, "Why did you select everything? Stupid.",
                            "Error", JOptionPane.ERROR_MESSAGE);
            
            Output.setText("Wara bugoa ka!");
         } else {
                      Collections.shuffle(agentsList); //Code to shuffle
                      //Get the first agent on the shuffled list
                      first = (String) agentsList.get(0);
                      second = (String) agentsList.get(1);
                      third = (String) agentsList.get(2);
                      fourth = (String) agentsList.get(3);
                      AgentCheck(first);
                      AgentCheck(second);
                      AgentCheck(third);
                      AgentCheck(fourth);
                      Output.setText(first+ "\n" + second + "\n" + third + "\n" + fourth);
                  
        }
    }//GEN-LAST:event_FourAgentShuffle

    private void FiveAgentShuffle(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FiveAgentShuffle
         ArrayList agentsList = AgentAdd();

        if (agentsList.size() < 5) {
            
            JOptionPane.showMessageDialog(null, "Why did you select everything? Stupid.",
                            "Error", JOptionPane.ERROR_MESSAGE);
            
            Output.setText("Wara bugoa ka!");
         } else {
                      Collections.shuffle(agentsList); //Code to shuffle
                      //Get the first agent on the shuffled list
                      first = (String) agentsList.get(0);
                      second = (String) agentsList.get(1);
                      third = (String) agentsList.get(2);
                      fourth = (String) agentsList.get(3);
                      fifth = (String) agentsList.get(4);
                      AgentCheck(first);
                      AgentCheck(second);
                      AgentCheck(third);
                      AgentCheck(fourth);
                      AgentCheck(fifth);
                      Output.setText(first+ "\n" + second + "\n" + third + "\n" + fourth + "\n" + fifth);
                  
        }
    }//GEN-LAST:event_FiveAgentShuffle

    private void AllDuelistsShuffle(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AllDuelistsShuffle
        Reset();        
        ArrayList<String> agentsList = new ArrayList<String>();
                        
                        if (Jett.isSelected() != true) {
                           agentsList.add("Jett");
                         } if (Neon.isSelected() != true) {
                           agentsList.add("Neon");
                         } if (Phoenix.isSelected() != true) {
                           agentsList.add("Phoenix");
                         } if (Raze.isSelected() != true) {
                           agentsList.add("Raze");
                         } if (Reyna.isSelected() != true) {
                           agentsList.add("Reyna");
                         } if (Yoru.isSelected() != true) {
                           agentsList.add("Yoru");
                         }
                         
         Collections.shuffle(agentsList);
            first = agentsList.get(0);
            second = agentsList.get(1);
            third = agentsList.get(2);
            fourth = agentsList.get(3);
            fifth = agentsList.get(4);
            AgentCheck(first);
            AgentCheck(second);
            AgentCheck(third);
            AgentCheck(fourth);
            AgentCheck(fifth);
         
          Output.setText(first+ "\n" + second + "\n" + third + "\n" + fourth + "\n" + fifth);
    }//GEN-LAST:event_AllDuelistsShuffle

    private void AllControllersShuffle(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AllControllersShuffle
        Reset();        
        ArrayList<String> agentsList = new ArrayList<String>();
                        
                        if (Astra.isSelected() != true) {
                           agentsList.add("Astra");
                         } if (Brimstone.isSelected() != true) {
                           agentsList.add("Brimstone");
                         } if (Omen.isSelected() != true) {
                           agentsList.add("Omen");
                         } if (Viper.isSelected() != true) {
                           agentsList.add("Viper");
                         } if (Your_Choice.isSelected() != true) {
                           agentsList.add("Your Choice");
                         }
                         
         Collections.shuffle(agentsList);
            first = agentsList.get(0);
            second = agentsList.get(1);
            third = agentsList.get(2);
            fourth = agentsList.get(3);
            fifth = agentsList.get(4);
            AgentCheck(first);
            AgentCheck(second);
            AgentCheck(third);
            AgentCheck(fourth);
            AgentCheck(fifth);
         
          Output.setText(first+ "\n" + second + "\n" + third + "\n" + fourth + "\n" + fifth);
    }//GEN-LAST:event_AllControllersShuffle

    private void AllInitiatorsShuffle(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AllInitiatorsShuffle
        Reset();        
        ArrayList<String> agentsList = new ArrayList<String>();
                        
                        if (Breach.isSelected() != true) {
                           agentsList.add("Breach");
                         } if (Fade.isSelected() != true) {
                           agentsList.add("Fade");
                         } if (KAYO.isSelected() != true) {
                           agentsList.add("Kay/0");
                         } if (Skye.isSelected() != true) {
                           agentsList.add("Skye");
                         } if (Sova.isSelected() != true) {
                           agentsList.add("Sova");
                         }
                         
         Collections.shuffle(agentsList);
            first = agentsList.get(0);
            second = agentsList.get(1);
            third = agentsList.get(2);
            fourth = agentsList.get(3);
            fifth = agentsList.get(4);
            AgentCheck(first);
            AgentCheck(second);
            AgentCheck(third);
            AgentCheck(fourth);
            AgentCheck(fifth);
         
          Output.setText(first+ "\n" + second + "\n" + third + "\n" + fourth + "\n" + fifth);
    }//GEN-LAST:event_AllInitiatorsShuffle

    private void AllSentinelsShuffle(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AllSentinelsShuffle
        Reset();        
        ArrayList<String> agentsList = new ArrayList<String>();
                        
                        if (Chamber.isSelected() != true) {
                           agentsList.add("Chamber");
                         } if (Cypher.isSelected() != true) {
                           agentsList.add("Cypher");
                         } if (Killjoy.isSelected() != true) {
                           agentsList.add("Killjoy");
                         } if (Sage.isSelected() != true) {
                           agentsList.add("Sage");
                         } if (Your_Choice.isSelected() != true) {
                           agentsList.add("Your Choice");
                         }
                         
         Collections.shuffle(agentsList);
            first = agentsList.get(0);
            second = agentsList.get(1);
            third = agentsList.get(2);
            fourth = agentsList.get(3);
            fifth = agentsList.get(4);
            AgentCheck(first);
            AgentCheck(second);
            AgentCheck(third);
            AgentCheck(fourth);
            AgentCheck(fifth);
         
          Output.setText(first+ "\n" + second + "\n" + third + "\n" + fourth + "\n" + fifth);
    }//GEN-LAST:event_AllSentinelsShuffle

    private void PerfectTeamShuffle(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PerfectTeamShuffle
        Reset();        
        ArrayList<String> DuelistList = new ArrayList<String>();
                        
                         if (Jett.isSelected() != true) {
                           DuelistList.add("Jett");
                         } if (Neon.isSelected() != true) {
                           DuelistList.add("Neon");
                         } if (Phoenix.isSelected() != true) {
                           DuelistList.add("Phoenix");
                         } if (Raze.isSelected() != true) {
                           DuelistList.add("Raze");
                         } if (Reyna.isSelected() != true) {
                           DuelistList.add("Reyna");
                         } if (Yoru.isSelected() != true) {
                           DuelistList.add("Yoru");
                         }
         Collections.shuffle(DuelistList);
            String duelist1 = DuelistList.get(0);
            String duelist2 = DuelistList.get(1);
         
         ArrayList<String> ControllerList = new ArrayList<String>();
                        
                        if (Astra.isSelected() != true) {
                           ControllerList.add("Astra");
                         } if (Brimstone.isSelected() != true) {
                           ControllerList.add("Brimstone");
                         } if (Omen.isSelected() != true) {
                           ControllerList.add("Omen");
                         } if (Viper.isSelected() != true) {
                           ControllerList.add("Viper");
                         }
                         
         Collections.shuffle(ControllerList);
            String controller = ControllerList.get(0);
         
         ArrayList<String> InitiatorList = new ArrayList<String>();
                        
                        if (Breach.isSelected() != true) {
                           InitiatorList.add("Breach");
                         } if (Fade.isSelected() != true) {
                           InitiatorList.add("Fade");
                         } if (KAYO.isSelected() != true) {
                           InitiatorList.add("Kay/0");
                         } if (Skye.isSelected() != true) {
                           InitiatorList.add("Skye");
                         } if (Sova.isSelected() != true) {
                           InitiatorList.add("Sova");
                         }
                         
         Collections.shuffle(InitiatorList);
            String initiator = InitiatorList.get(0);
         
         ArrayList<String> SentinelList = new ArrayList<String>();
                        
                        if (Chamber.isSelected() != true) {
                           SentinelList.add("Chamber");
                         } if (Cypher.isSelected() != true) {
                           SentinelList.add("Cypher");
                         } if (Killjoy.isSelected() != true) {
                           SentinelList.add("Killjoy");
                         } if (Sage.isSelected() != true) {
                           SentinelList.add("Sage");
                         }
                         
         Collections.shuffle(SentinelList);
            String sentinel = SentinelList.get(0);
            
         ArrayList<String> agentsList = new ArrayList<String>();
                  agentsList.add(duelist1);
                  agentsList.add(duelist2);
                  agentsList.add(controller);
                  agentsList.add(initiator);
                  agentsList.add(sentinel);
         Collections.shuffle(agentsList);
                         
         Collections.shuffle(agentsList);
            first = agentsList.get(0);
            second = agentsList.get(1);
            third = agentsList.get(2);
            fourth = agentsList.get(3);
            fifth = agentsList.get(4);
            AgentCheck(first);
            AgentCheck(second);
            AgentCheck(third);
            AgentCheck(fourth);
            AgentCheck(fifth);
         
          Output.setText(first+ "\n" + second + "\n" + third + "\n" + fourth + "\n" + fifth);
    }//GEN-LAST:event_PerfectTeamShuffle

    private void RandomizeBtn11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RandomizeBtn11ActionPerformed
        Reset();        
        ArrayList<String> DuelistList = new ArrayList<String>();
                        
                         if (Jett.isSelected() != true) {
                           DuelistList.add("Jett");
                         } if (Neon.isSelected() != true) {
                           DuelistList.add("Neon");
                         } if (Phoenix.isSelected() != true) {
                           DuelistList.add("Phoenix");
                         } if (Raze.isSelected() != true) {
                           DuelistList.add("Raze");
                         } if (Reyna.isSelected() != true) {
                           DuelistList.add("Reyna");
                         } if (Yoru.isSelected() != true) {
                           DuelistList.add("Yoru");
                         }
         Collections.shuffle(DuelistList);
            String duelist1 = DuelistList.get(0);
         
         ArrayList<String> ControllerList = new ArrayList<String>();
                        
                        if (Astra.isSelected() != true) {
                           ControllerList.add("Astra");
                         } if (Brimstone.isSelected() != true) {
                           ControllerList.add("Brimstone");
                         } if (Omen.isSelected() != true) {
                           ControllerList.add("Omen");
                         } if (Viper.isSelected() != true) {
                           ControllerList.add("Viper");
                         }
                         
         Collections.shuffle(ControllerList);
            String controller = ControllerList.get(0);
         
         ArrayList<String> InitiatorList = new ArrayList<String>();
                        
                        if (Breach.isSelected() != true) {
                           InitiatorList.add("Breach");
                         } if (Fade.isSelected() != true) {
                           InitiatorList.add("Fade");
                         } if (KAYO.isSelected() != true) {
                           InitiatorList.add("Kay/0");
                         } if (Skye.isSelected() != true) {
                           InitiatorList.add("Skye");
                         } if (Sova.isSelected() != true) {
                           InitiatorList.add("Sova");
                         }
                         
         Collections.shuffle(InitiatorList);
            String initiator_one = InitiatorList.get(0);
            String initiator_two = InitiatorList.get(1);
         
         ArrayList<String> SentinelList = new ArrayList<String>();
                        
                        if (Chamber.isSelected() != true) {
                           SentinelList.add("Chamber");
                         } if (Cypher.isSelected() != true) {
                           SentinelList.add("Cypher");
                         } if (Killjoy.isSelected() != true) {
                           SentinelList.add("Killjoy");
                         } if (Sage.isSelected() != true) {
                           SentinelList.add("Sage");
                         }
                         
         Collections.shuffle(SentinelList);
            String sentinel = SentinelList.get(0);
            
         ArrayList<String> agentsList = new ArrayList<String>();
                  agentsList.add(duelist1);
                  agentsList.add(controller);
                  agentsList.add(initiator_one);
                  agentsList.add(initiator_two);
                  agentsList.add(sentinel);
         Collections.shuffle(agentsList);
                         
         Collections.shuffle(agentsList);
            first = agentsList.get(0);
            second = agentsList.get(1);
            third = agentsList.get(2);
            fourth = agentsList.get(3);
            fifth = agentsList.get(4);
            AgentCheck(first);
            AgentCheck(second);
            AgentCheck(third);
            AgentCheck(fourth);
            AgentCheck(fifth);
         
          Output.setText(first+ "\n" + second + "\n" + third + "\n" + fourth + "\n" + fifth);
    }//GEN-LAST:event_RandomizeBtn11ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws FileNotFoundException {

        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RandomAgentGenerator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RandomAgentGenerator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RandomAgentGenerator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RandomAgentGenerator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new RandomAgentGenerator().setVisible(true);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(RandomAgentGenerator.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Astra;
    private javax.swing.JCheckBox Breach;
    private javax.swing.JCheckBox Brimstone;
    private javax.swing.JCheckBox Chamber;
    private javax.swing.JCheckBox Cypher;
    private javax.swing.JCheckBox Fade;
    private javax.swing.JCheckBox Jett;
    private javax.swing.JCheckBox KAYO;
    private javax.swing.JCheckBox Killjoy;
    private javax.swing.JCheckBox Neon;
    private javax.swing.JCheckBox Omen;
    private javax.swing.JTextArea Output;
    private javax.swing.JCheckBox Phoenix;
    private javax.swing.JButton QuitBtn;
    private javax.swing.JButton RandomizeBtn;
    private javax.swing.JButton RandomizeBtn10;
    private javax.swing.JButton RandomizeBtn11;
    private javax.swing.JButton RandomizeBtn2;
    private javax.swing.JButton RandomizeBtn3;
    private javax.swing.JButton RandomizeBtn4;
    private javax.swing.JButton RandomizeBtn5;
    private javax.swing.JButton RandomizeBtn6;
    private javax.swing.JButton RandomizeBtn7;
    private javax.swing.JButton RandomizeBtn8;
    private javax.swing.JButton RandomizeBtn9;
    private javax.swing.JCheckBox Raze;
    private javax.swing.JButton ResetBtn;
    private javax.swing.JCheckBox Reyna;
    private javax.swing.JCheckBox Sage;
    private javax.swing.JCheckBox Skye;
    private javax.swing.JCheckBox Sova;
    private javax.swing.JLabel SubtitleLbl1;
    private javax.swing.JLabel TitleLbl1;
    private javax.swing.JCheckBox Viper;
    private javax.swing.JCheckBox Yoru;
    private javax.swing.JCheckBox Your_Choice;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
