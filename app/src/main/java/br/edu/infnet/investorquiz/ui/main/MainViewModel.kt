package br.edu.infnet.investorquiz.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import java.text.NumberFormat
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Locale

class MainViewModel : ViewModel() {
    var final_score: Int = 0
    var question_score: Int = 0

    fun zero_point_answer() {
        this.question_score = 0
    }
    fun one_point_answer() {
        this.question_score = 1
    }
    fun two_point_answer() {
        this.question_score = 2
    }
    fun three_point_answer() {
        this.question_score = 3
    }
    fun four_point_answer() {
        this.question_score = 4
    }
    fun five_point_answer() {
        this.question_score = 5
    }
    fun count_answer() {
        this.final_score += question_score
    }
}