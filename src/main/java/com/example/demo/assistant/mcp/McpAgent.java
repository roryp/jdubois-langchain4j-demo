package com.example.demo.assistant.mcp;

import com.example.demo.assistant.json.TopAuthors;

public interface McpAgent {

    TopAuthors askGitHub(String userMessage);
}
