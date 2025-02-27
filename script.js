

let gameId;
const cells = document.querySelectorAll('.cell');

//Create a new game
fetch('/game/create', { method: 'POST'})
    .then(Response => Response.json())
    .then(data => {
        gameId = data.id
    }); 

cells.forEach(cell => {
    cell.addEventListener('click', () => {
        const cellIndex = parseInt(cell.dataset.cell);
        const row = Math.floor(cellIndex / 3);
        const col = cellIndex % 3;

        fetch(`/game/move/${gameId}`, {
            method: 'POST',
            headers: { 'Content-Type': 'application/json'},
            body: JSON.stringify({ row, col})
  
       })
       .then(response => response.json())
       .then(game => {
        cell.textContent = game.currentPlayer === 'X' ? 'O' : 'X';
        if (game.gameState !== 'IN_PROGRESS') {
            alert(game.gameState === 'DRAW' ? 'Draw!' : `${game.currentPlayer} wins!`);
        }
       });
    });
});    
