package com.sillasca.godie.calculadorafuncional

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView



class MainActivity : AppCompatActivity() , View.OnClickListener {

    private var operador : String ? = null
    private var valorAnterior: String? = null
    private var etIngreso: EditText?=null

    private var btn1 : Button?=null
    private var btn2 : Button?=null
    private var btn3 : Button?=null
    private var btn4 : Button?=null
    private var btn5 : Button?=null
    private var btn6 : Button?=null
    private var btn7 : Button?=null
    private var btn8 : Button?=null
    private var btn9 : Button?=null
    private var btn0 : Button?=null
    private var btnpunto : Button?=null

    private var btnsuma : Button?=null
    private var btnresta : Button?=null
    private var btnmult : Button?=null
    private var btndiv : Button?=null
    private var btnigual : Button?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etIngreso = findViewById<EditText>(R.id.etIngreso)
        btn1=findViewById<Button>(R.id.botoncito1)
        btn2=findViewById<Button>(R.id.botoncito2)
        btn3=findViewById<Button>(R.id.botoncito3)
        btn4=findViewById<Button>(R.id.botoncito4)
        btn5=findViewById<Button>(R.id.botoncito5)
        btn6=findViewById<Button>(R.id.botoncito6)
        btn7=findViewById<Button>(R.id.botoncito7)
        btn8=findViewById<Button>(R.id.botoncito8)
        btn9=findViewById<Button>(R.id.botoncito9)
        btn0=findViewById<Button>(R.id.botoncito0)
        btnpunto=findViewById<Button>(R.id.botoncitopunto)
        btnsuma=findViewById<Button>(R.id.botoncitomas)
        btnresta=findViewById<Button>(R.id.botoncitomenos)
        btnmult=findViewById<Button>(R.id.botoncitopor)
        btndiv=findViewById<Button>(R.id.botoncitodiv)
        btnigual=findViewById<Button>(R.id.botoncitoigual)


        btn1!!.setOnClickListener(this)
        btn2!!.setOnClickListener(this)
        btn3!!.setOnClickListener(this)
        btn4!!.setOnClickListener(this)
        btn5!!.setOnClickListener(this)
        btn6!!.setOnClickListener(this)
        btn7!!.setOnClickListener(this)
        btn8!!.setOnClickListener(this)
        btn9!!.setOnClickListener(this)
        btn0!!.setOnClickListener(this)
        btnpunto!!.setOnClickListener(this)
        btnsuma!!.setOnClickListener(this)
        btnresta!!.setOnClickListener(this)
        btnmult!!.setOnClickListener(this)
        btndiv!!.setOnClickListener(this)
        btnigual!!.setOnClickListener(this)
    }

    override fun onClick(v: View?){
        var resultado: Float
        when (v?.id) {
            R.id.botoncito1 -> { etIngreso?.setText( etIngreso?.text.toString() + "1") }
            R.id.botoncito2 -> { etIngreso?.setText( etIngreso?.text.toString() + "2") }
            R.id.botoncito3 -> { etIngreso?.setText( etIngreso?.text.toString() + "3") }
            R.id.botoncito4 -> { etIngreso?.setText( etIngreso?.text.toString() + "4") }
            R.id.botoncito5 -> { etIngreso?.setText( etIngreso?.text.toString() + "5") }
            R.id.botoncito6 -> { etIngreso?.setText( etIngreso?.text.toString() + "6") }
            R.id.botoncito7 -> { etIngreso?.setText( etIngreso?.text.toString() + "7") }
            R.id.botoncito8 -> { etIngreso?.setText( etIngreso?.text.toString() + "8") }
            R.id.botoncito9 -> { etIngreso?.setText( etIngreso?.text.toString() + "9") }
            R.id.botoncito0 -> { etIngreso?.setText( etIngreso?.text.toString() + "0") }
            R.id.botoncitopunto -> { etIngreso?.setText( etIngreso?.text.toString() + ".") }

            R.id.botoncitomas -> {
                valorAnterior=etIngreso?.text.toString()
                etIngreso?.setText("")
                operador="+"
            }
            R.id.botoncitomenos -> {
                valorAnterior=etIngreso?.text.toString()
                etIngreso?.setText("")
                operador="-"
            }
            R.id.botoncitopor -> {
                valorAnterior=etIngreso?.text.toString()
                etIngreso?.setText("")
                operador="*"
            }
            R.id.botoncitodiv -> {
                //Almacenamos el valor anterior
                valorAnterior=etIngreso?.text.toString()
                etIngreso?.setText("")
                operador="/"
            }

            R.id.botoncitoigual->{
                when (operador){
                    "+"->{
                        resultado = valorAnterior?.toFloat()!! + etIngreso?.text.toString().toFloat()
                        etIngreso?.setText( resultado.toString());
                    }
                    "-"->{
                        resultado = valorAnterior?.toFloat()!! - etIngreso?.text.toString().toFloat()
                        etIngreso?.setText( resultado.toString());
                    }
                    "*"->{
                        resultado = valorAnterior?.toFloat()!! * etIngreso?.text.toString().toFloat()
                        etIngreso?.setText( resultado.toString());
                    }
                    "/"->{
                        resultado = valorAnterior?.toFloat()!! / etIngreso?.text.toString().toFloat()
                        etIngreso?.setText( resultado.toString());
                    }
                }
            }



        }
    }

}
