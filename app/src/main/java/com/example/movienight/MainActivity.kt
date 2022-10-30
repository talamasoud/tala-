package com.example.movienight

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val spVal: Spinner = findViewById(R.id.sp)
        var options = arrayOf(
            "choose your movie",
            "Horror",
            "Comedy",
            "Romantic",
            "Drama",
            "Action",
            "Top Movie2022"
        )
        spVal.adapter =
            ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, options)
        var flag1 = ""
        val textname: TextView = findViewById(R.id.S1)
        spVal.onItemSelectedListener=object:AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                flag1=options.get(p2)
                if (flag1 == "Horror") {
                    textname.text = "Run"

                } else if (flag1 == "Comedy") {

                    textname.text = "the Takedown"

                }
                else if (flag1 == "Romantic")
                {
                    textname.text = "Sierra Burgess Is a Loser"

                }
                else if (flag1 == "Darma")
                {
                    textname.text = "7 Kogustaki Mucize"
                }
                else if (flag1 == "Action")
                {
                    textname.text = "Avengement"

                }
                else if (flag1 == "Top Movie2022")
                {
                    textname.text = "Luckiest Girl Alive"
                }
                else if(flag1=="choose your movie"){
                    textname.text="please select a movie"
                }

            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }

        val ptd: Button =findViewById(R.id.ptd1)
        val des1:TextView=findViewById(R.id.des)
        ptd.setOnClickListener{

            if (flag1 == "Horror") {
                des1.text = "The film stars Kiera Allen as Chloe Sherman," +
                        " a disabled homeschooled teenager who begins to " +
                        "suspect that her mother Diane (Sarah Paulson)" +
                        " is keeping a dark secret about her upbringing"

            } else if (flag1 == "Comedy") {

                des1.text = "As befits other movies in this genre, we have a pair" +
                        " of mismatched cops who find themselves working together" +
                        " after a crime is committed." +
                        " The crime, in this case, is an apparent murder on a train but " +
                        "rather than finding the victim's dead body they find half of his dismembered corpse instead"

            }
            else if (flag1 == "Romantic")
            {
                des1.text = "A case of mistaken identity results in unexpected romance" +
                        " when the most popular girl in high school and the biggest loser" +
                        " must come together to win over their crushes"
            }
            else if (flag1 == "Darma")
            {
                des1.text = "An autistic father, Mehmet Koyuncu (Memo)," +
                        " lives with his young daughter, Ova, and his grandmother on a hillside. " +
                        "But his world is turned upside down when he is falsely charged with murdering" +
                        " a girl who had died due to an accident"
            }
            else if (flag1 == "Action")
            {
                des1.text = "The film follows Cain Burgess, a prisoner who escapes police custody " +
                        "after his mother's death and visits a private bar," +
                        " holding its members hostage as he starts revealing his past and" +
                        " what led to him becoming a violent fighter"

            }
            else if (flag1 == "Top Movie2022")
            {
                des1.text = "The film revolves around successful New Yorker Ani FaNelli (Kunis)" +
                        " who appears to have it all: a successful journalism career and her dream wedding " +
                        "on the horizon"
            }
            else if(flag1=="choose your movie"){
                des1.text="please select a movie"
            }

        }











    }










}




