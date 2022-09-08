package com.innaval.fitnesstracker

import com.innaval.fitnesstracker.model.Calc

interface OnListClickListener {
    fun onCLick(id: Int, type: String)
    fun onLongClick(position: Int, calc: Calc)
}