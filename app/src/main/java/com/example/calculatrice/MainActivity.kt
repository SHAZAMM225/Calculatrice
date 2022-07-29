package com.example.calculatrice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_main.*
import org.mariuszgromada.math.mxparser.Expression
import java.lang.Exception
import java.text.DecimalFormat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        delete.setOnClickListener{


            input.text=""
            output.text=""
        }

        low_p.setOnClickListener{

            input.text=add_To_input_text("(")
        }
        fast_p.setOnClickListener{

            input.text=add_To_input_text(")")

        }

        button_0.setOnClickListener{
            input.text=add_To_input_text("0")

        }


        button_1.setOnClickListener{
            input.text=add_To_input_text("1")

        }


        button_2.setOnClickListener{
            input.text=add_To_input_text("2")

        }

        button_3.setOnClickListener{
            input.text=add_To_input_text("3")

        }

        button_4.setOnClickListener{
            input.text=add_To_input_text("4")

        }

        button_5.setOnClickListener{
            input.text=add_To_input_text("5")

        }

        button_6.setOnClickListener{
            input.text=add_To_input_text("6")

        }


        button_7.setOnClickListener{
            input.text=add_To_input_text("7")

        }

        button_8.setOnClickListener{
            input.text=add_To_input_text("8")

        }

        button_9.setOnClickListener{
            input.text=add_To_input_text("9")

        }

        button_point.setOnClickListener{
            input.text=add_To_input_text(".")

        }

        button_add.setOnClickListener{
            input.text=add_To_input_text("+")

        }

        button_minis.setOnClickListener{
            input.text=add_To_input_text("-")

        }

        button_div.setOnClickListener{
            input.text=add_To_input_text("/")

        }



        button_mult.setOnClickListener{
            input.text=add_To_input_text("*")

        }

        button_eqauls.setOnClickListener{
            show_res()

        }




    }
    private fun add_To_input_text(ButtonValue:String):String
    {
return "${input.text}$ButtonValue"
    }


    private fun show_res(){
try {

        val exp=input.text.toString()
        val res=Expression(exp).calculate()
        if (res.isNaN())
        {
            output.text="ERROR"
            output.setTextColor(ContextCompat.getColor(this,R.color.teal_200))
        }else
        {
            //show res
            output.text=DecimalFormat("0.######").format(res).toString()
            output.setTextColor(ContextCompat.getColor(this,R.color.green))

        }}catch (e:Exception){

            //show error message
            output.text="ERROR3"
    output.setTextColor(ContextCompat.getColor(this,R.color.teal_200))

}

    }

}