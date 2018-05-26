package com.myporfolio.myportfolio;

import android.content.Context;
import android.graphics.Color;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class SlideAdapter extends PagerAdapter {
    Context context;
    LayoutInflater inflater;

    // list of images
    public int[] lst_images = {
            R.drawable.image_1,
            R.drawable.image_2,
            R.drawable.image_3,
            R.drawable.image_4,
            R.drawable.image_1,
            R.drawable.image_2
    };

    // list of titles
    public String[] lst_title = {
            "ABOUT ME",
            "INTERESTS",
            "EDUCATION",
            "EXPERIENCE",
            "SKILLS",
            "HIRE ME!"
    };

    // list of descriptions
    public String[] lst_description = {
            "Hi, I am Jordyn Thompson.\n " +
                    "\nI am a second year Computer Science and Information Systems student at Victoria university of Wellington. \n" +
                    "\nHere is my CV and why you should hire me, in an app!",
            "INTERESTS",
            "Currently I am second year Victoria university of Wellington student, studying Computer Science and Information systems." +
                    "Papers I have done includes mathematics, physics, information management, programming, cyber security. \n\n" +
                    "Other education:\n" +
                    "- Level 2 U-Skills Graphic Design certificate, Palmerston North School of Design, Palmerston North, 2015\n" +
                    "- NCEA Level 3, 2, and 1, Otaki College, Otaki, 2014-2016\n" +
                    "\nCourses I have done include drama, business computing, physics, mathematics, English.",
            "",
            "Technical Skills\n" +
                    "   - Experience in programming with Java, Python, C, HTML, CSS, JavaScript\n" +
                    "   - Experience with Microsoft Office \n" +
                    "(Mostly Powerpoint, Excel, Word)\n" +
                    "   - Extensive experience with Adobe \n" +
                    "(Mostly in InDesign, Photoshop, Illustrator\n" +
                    "\n Personal Skills" +
                    " ",
            "When I finish my degree, I want to work with front-end development as that is where my passion for coding originally came from. I am also interested in cyber security and hope to get involved in that somehow in the future.\n\n" +
                    "Where you can contact me:\n" +
                    "Mobile: 027 246 6848 \n" +
                    "Email: jordyn.poppy04@gmail.com \n\n" +
                    "Where you can find me:\n" +
                    "GitHub: missjordynthompson \n"
    };

    // list of background colors
    public int[] lst_backgroundcolor = {
            Color.rgb(6,163, 220),   // blue
            Color.rgb(239,85,85),   // redish orange
            Color.rgb(110, 49, 89), // purple
            Color.rgb(17,188, 39),  // green
            Color.rgb(0,171, 255),  // blue
            Color.rgb(55,55,55)     // black
    };

    public SlideAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return lst_title.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view==(LinearLayout)object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.slide,container,false);
        LinearLayout layoutslide = (LinearLayout) view.findViewById(R.id.slidelinearlayout);
        ImageView imgslide = (ImageView)  view.findViewById(R.id.slideimg);
        TextView txttitle= (TextView) view.findViewById(R.id.txttitle);
        TextView description = (TextView) view.findViewById(R.id.txtdescription);
        layoutslide.setBackgroundColor(lst_backgroundcolor[position]);
        imgslide.setImageResource(lst_images[position]);
        txttitle.setText(lst_title[position]);
        description.setText(lst_description[position]);
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout)object);
    }
}
