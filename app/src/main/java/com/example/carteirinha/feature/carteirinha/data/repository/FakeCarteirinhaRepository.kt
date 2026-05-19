package com.example.carteirinha.feature.carteirinha.data.repository

import com.example.carteirinha.core.designsystem.navigation.Routes
import com.example.carteirinha.feature.carteirinha.domain.model.Carteirinha
import kotlinx.coroutines.delay

class FakeCarteirinhaRepository : CarteirinhaRepository {
    override suspend fun buscarCarteirinha(): Result<Carteirinha> {
        delay(1500)

        return Result.success(
            Carteirinha(
                nome = "Nicoly Machado",
                curso = "Técnico em Desenvolvimento de Sistemas",
                turma = "4DEVM-T1",
                matricula = "20260001",
                unidade = "SENAI Anchieta",
                status = "Ativo",
                qrCodeContent = "MATRICULA:20260001;ALUNO:Nicoly Machado;TURMA:4DEVM-T2"
            )
        )
    }
}