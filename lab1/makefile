# Comando do compilador Java
JAVAC=javac
# Comando da JVM
JAVA=java
# Caminho para o arquivo JAR do ANTLR
ANTLR_PATH=/Users/joaoloss/Documents/UFES/compiladores/lab1/tools/antlr-4.13.2-complete.jar
# Opção de configuração do CLASSPATH para o ambiente Java
CLASS_PATH_OPTION=-cp .:$(ANTLR_PATH)
# Configuração do comando de compilação do ANTLR
ANTLR4=$(JAVA) -jar $(ANTLR_PATH)
# Configuração do ambiente de teste do ANTLR
GRUN=$(JAVA) $(CLASS_PATH_OPTION) org.antlr.v4.gui.TestRig
# Nome da gramática
GRAMMAR_NAME=gramatica_ezlang
# Diretório para aonde vão os arquivos gerados
GEN_PATH=lexer

# Executa o ANTLR e o compilador Java
all: antlr javac
# Executa o ANTLR para compilar a gramática
antlr:
	$(ANTLR4) -o $(GEN_PATH) $(GRAMMAR_NAME).g
# Executa o javac para compilar os arquivos gerados
javac:
	$(JAVAC) $(CLASS_PATH_OPTION) $(GEN_PATH)/*.java

IN_DIR=../in
OUT_DIR=../out

run:
	mkdir -p out
	cd $(GEN_PATH) && \
	for FILE in $(IN_DIR)/*; do \
		BASENAME=$$(basename $$FILE); \
		echo "Processing $$BASENAME"; \
		$(GRUN) $(GRAMMAR_NAME) tokens -tokens $$FILE > $(OUT_DIR)/$$BASENAME.tokens 2>&1; \
	done
	
# Remove os arquivos gerados pelo ANTLR
clean:
	@rm -rf $(GEN_PATH)