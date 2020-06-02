package com.cassiolucianodasilva.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val pessoaList: MutableList<Pessoa> = mutableListOf(
        Pessoa("Cassio luciano da silva", "cassioluciano@email.com", "1111-1111"),
        Pessoa("karina luciana da silva", "karinalucianadasilva@email.com", "2222-2222"),
        Pessoa("Cassio luciano da silva", "cassioluciano@email.com", "1111-1111"),
        Pessoa("karina luciana da silva", "karinalucianadasilva@email.com", "2222-2222"),
        Pessoa("Cassio luciano da silva", "cassioluciano@email.com", "1111-1111"),
        Pessoa("karina luciana da silva", "karinalucianadasilva@email.com", "2222-2222"),
        Pessoa("Cassio luciano da silva", "cassioluciano@email.com", "1111-1111"),
        Pessoa("karina luciana da silva", "karinalucianadasilva@email.com", "2222-2222"),
        Pessoa("Cassio luciano da silva", "cassioluciano@email.com", "1111-1111"),
        Pessoa("karina luciana da silva", "karinalucianadasilva@email.com", "2222-2222"),
        Pessoa("jeh ferigato ", "ferigato@email.com", "1010-1010")

    )

    lateinit var pessoaAdapter: PessoaAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        pessoaAdapter = PessoaAdapter(this, pessoaList)
        recyclerViewPessoas.adapter = pessoaAdapter
        recyclerViewPessoas.layoutManager = LinearLayoutManager(this)
        recyclerViewPessoas.smoothScrollToPosition(pessoaList.size)
    }

}
