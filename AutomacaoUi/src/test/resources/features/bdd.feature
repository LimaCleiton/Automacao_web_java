#Author: cleiton_rmv@hotmail.com

Feature: Adicionar produtos no carrinho e validar
 Como cliente Quero selecionar produtos Para adicionar ao carrinho

 
  Scenario: CT01 - Adicionar produto
    Given que e acesse o site da loja
    When escolher um produto
    Then valido os produtos no carrinho fechando o browser
    

  