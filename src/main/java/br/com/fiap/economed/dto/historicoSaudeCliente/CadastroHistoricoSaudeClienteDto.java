package br.com.fiap.economed.dto.historicoSaudeCliente;

import java.time.LocalDate;

public record CadastroHistoricoSaudeClienteDto(
        Long clienteId,
        LocalDate dataRegistro,
        String fumo,
        String doencaPrincipal,
        String historicoFamiliar,
        String alergias,
        String observacoes) {
}