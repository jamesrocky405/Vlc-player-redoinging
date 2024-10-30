import javax.swing.*;
import java.awt.*;

public class VLC extends JFrame {
    Image vlcimage = Toolkit.getDefaultToolkit().createImage("C:/Users/SARAH/IdeaProjects/VLCplayersample/src/VLC_media_player-Logo.wine.png");

    JMenuBar jMenuBar = new JMenuBar();
    JMenu load = new JMenu("load");
    JMenu fine = new JMenu("fine");
    JMenu save = new JMenu("save");
    JMenu upload = new JMenu("upload");
    JMenu remove = new JMenu("remove");

    JPanel bottom = new JPanel();
    JPanel toppanel = new JPanel(new GridBagLayout());

    JProgressBar progressBar = new JProgressBar(0,200);

    GridBagConstraints gbc = new GridBagConstraints();



    ImageIcon backicon = new ImageIcon("C:/Users/SARAH/IdeaProjects/VLCplayersample/src/backward.png");
    Image backimg = backicon.getImage();
    Image resizedback = backimg.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
    ImageIcon resizedback2 = new ImageIcon(resizedback);

    ImageIcon playicon = new ImageIcon("C:/Users/SARAH/IdeaProjects/VLCplayersample/src/play-button.png");
    Image playimg = playicon.getImage();
    Image resizedplay = playimg.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
    ImageIcon resizedplay2 = new ImageIcon(resizedplay);

    ImageIcon forwardicon = new ImageIcon("C:/Users/SARAH/IdeaProjects/VLCplayersample/src/fast-forward.png");
    Image forwardimg = forwardicon.getImage();
    Image resizedforward = forwardimg.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
    ImageIcon resizedforward2 = new ImageIcon(resizedforward);

    ImageIcon pauseicon = new ImageIcon("C:/Users/SARAH/IdeaProjects/VLCplayersample/src/pause.png");
    Image pauseimg = pauseicon.getImage();
    Image resizedpause = pauseimg.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
    ImageIcon resizedpause2 = new ImageIcon(resizedpause);

    ImageIcon listicon = new ImageIcon("C:/Users/SARAH/IdeaProjects/VLCplayersample/src/playlist.png");
    Image listimg = listicon.getImage();
    Image resizedlist = listimg.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
    ImageIcon resizedlist2 = new ImageIcon(resizedlist);

    ImageIcon shuffleicon = new ImageIcon("C:/Users/SARAH/IdeaProjects/VLCplayersample/src/shuffle.png");
    Image shuffleimg = shuffleicon.getImage();
    Image resizedshuffle = shuffleimg.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
    ImageIcon resizedshuffle2 = new ImageIcon(resizedshuffle);

    JButton back = new JButton(resizedback2);
    JButton play = new JButton(resizedplay2);
    JButton forward = new JButton(resizedforward2);
    JButton pause = new JButton(resizedpause2);
    JButton playlist = new JButton(resizedlist2);
    JButton shuffle = new JButton(resizedshuffle2);


    void player (){
        //gbc.gridx = 0;
        //gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.CENTER;
        //gbc.fill = GridBagConstraints.NONE;

        //progressBar.setSize(800,10);

        bottom.add(back);
        bottom.add(play);
        bottom.add(pause);
        bottom.add(forward);
        bottom.add(shuffle);
        bottom.add(playlist);


        toppanel.setPreferredSize(new Dimension(700,20));
        toppanel.add(progressBar,gbc);

        bottom.setPreferredSize(new Dimension(700,40));
        bottom.setLayout(new BoxLayout(bottom, BoxLayout.X_AXIS));

        jMenuBar.add(fine);
        jMenuBar.add(load);
        jMenuBar.add(save);
        jMenuBar.add(upload);
        jMenuBar.add(remove);




        setIconImage(vlcimage);
        getContentPane().setBackground(Color.black);
        setLayout(new BorderLayout());
        setJMenuBar(jMenuBar);
        setTitle("VLC PLAYER");
        setSize(600,600);

        add(toppanel, BorderLayout.NORTH);
        add(bottom, BorderLayout.SOUTH);
        setVisible(true);
    }
}
