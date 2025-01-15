let tasks = []; // Mock task list

function fetchTasks() {
    const taskList = document.getElementById("taskList");
    taskList.innerHTML = "";
    tasks.forEach((task, index) => {
        const li = document.createElement("li");

        // Task description
        const taskText = document.createElement("span");
        taskText.textContent = task.description;
        taskText.classList.add("task-text");
        li.appendChild(taskText);

        // Edit button
        const editButton = document.createElement("button");
        editButton.textContent = "Edit";
        editButton.onclick = () => editTask(index);
        li.appendChild(editButton);

        // Delete button
        const deleteButton = document.createElement("button");
        deleteButton.textContent = "Delete";
        deleteButton.onclick = () => deleteTask(index);
        li.appendChild(deleteButton);

        taskList.appendChild(li);
    });
}

function addTask() {
    const taskInput = document.getElementById("taskInput");
    const task = { description: taskInput.value, completed: false };
    if (task.description.trim() !== "") {
        tasks.push(task);       // Add the task to the mock list
        taskInput.value = "";   // Clear the input field
        fetchTasks();           // Update the UI
    } else {
        alert("Please enter a task!");
    }
}

function deleteTask(index) {
    tasks.splice(index, 1);         // Remove the task from the mock list
    fetchTasks();                              // Update the UI
}

function editTask(index) {
    const task = tasks[index];
    const newDescription = prompt("Edit task:", task.description);
    if (newDescription !== null && newDescription.trim() !== "") {
        tasks[index].description = newDescription;  // Update the task description
        fetchTasks();                               // Refresh the task list
    } else if (newDescription === "") {
        alert("Task description cannot be empty");
    }
}

document.addEventListener("DOMContentLoaded", fetchTasks);
